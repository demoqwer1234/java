package cn.itcast.day11.TestBSTcp;


import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TestTcpServer {

    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8080);

        /*
            浏览器解析服务器写回的html页面， 网页中如果有图片， 那么浏览器就会独单的开启一个线程， 读取服务器的图片
            所以就必须让服务器一直处于监听状态
         */
        while(true){
            Socket socket = server.accept();

            /*
                开启线程
             */
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try{
                        InputStream is = socket.getInputStream();
                        /*int len = 0;
                        byte [] bytes = new byte[1024];
                        while((len  = is.read(bytes)) != -1){
                            System.out.println(new String (bytes, 0,len));
                        }*/

                        //把字节 转换为字符读取
                        BufferedReader br = new BufferedReader(new InputStreamReader(is));

                        //获得中间的文件路径
                        String line = br.readLine();             //   GET //11-Net//web//index.html HTTP/1.1
                        String[] arr = line.split(" ");   //   //11-Net//web//index.html
                        String htmlpath = arr[1].substring(2);   //   11-Net//web//index.html

                        FileInputStream fis = new FileInputStream(htmlpath);
                        OutputStream os = socket.getOutputStream();

                        //写http协议效应头，固定写法
                        os.write("http//1.1 200 ok\r\n".getBytes());
                        os.write("Content-Type:text/html\r\n".getBytes());
                        //必须写入空行， 否则服务器不解析
                        os.write("\r\n".getBytes());

                        int len =0;
                        byte [] bytes = new byte[1024];
                        while((len = fis.read(bytes)) != -1){
                            os.write(bytes,0,len);
                        }

                        fis.close();
                    }catch (IOException e ){
                        e.printStackTrace();
                    }
                    finally {
                        try {
                            socket.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }).start();

        }
       // server.close();
    }

}

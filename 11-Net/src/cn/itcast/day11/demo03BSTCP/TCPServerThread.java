package cn.itcast.day11.demo03BSTCP;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerThread {

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

                        //把is网络字节流对象， 转换为字符缓冲流对象
                        BufferedReader br = new BufferedReader(new InputStreamReader(is));

                        //读取客户端请求信息的第一行读取出来    GET //11-Net//web//index.html HTTP/1.1
                        String line = br.readLine();
                        //把读取信息进行切割， 只要中间部分           //11-Net//web//index.html
                        String[] arr = line.split(" ");
                        //把路径前面的 / 去掉 ，进行截取  11-Net//web//index.html
                        String htmlpath = arr[1].substring(2);
                        System.out.println(htmlpath);

                        //创建一个本地输入流， 构造方法中绑定htnlpath路径
                        FileInputStream fis = new FileInputStream(htmlpath);
                        //调用socket中的getOutputStream方法（）获取网络输出流对象
                        OutputStream os = socket.getOutputStream();

                        //写http协议效应头，固定写法
                        os.write("http//1.1 200 ok\r\n".getBytes());
                        os.write("Content-Type:text/html\r\n".getBytes());
                        //必须写入空行， 否则服务器不解析
                        os.write("\r\n".getBytes());

                        //一读一写，把服务器读取的html 读取到客户端
                        int len = 0;
                        byte []bytes = new byte[10224];
                        while((len =fis.read(bytes)) !=-1){
                            os.write(bytes,0,len);
                        }

                        fis.close();
                        socket.close();
                    }catch (IOException e){
                        e.printStackTrace();
                    }
                }
            }).start();
        }
        //server.close();
    }
}

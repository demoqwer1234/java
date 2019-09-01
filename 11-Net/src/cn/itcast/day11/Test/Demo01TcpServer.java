package cn.itcast.day11.Test;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

/*
    创建新项目，按以下要求编写代码：
        在项目下创建TCP 服务器端 端口号为8888
        1:等待客户端连接   如果有客户端连接  获取到客户端对象
        2:获取到客户端对象之后 当前在服务器读取数据客户端传送数据

 */
public class Demo01TcpServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8888);

        //让服务器一直处于运行监听状态
        while(true){

            //避免浪费资源， 所以到客户端请求，就开启一个线程
            new Thread(new Runnable() {
                Socket socket = server.accept();

                @Override
                public void run() {
                    try{
                        InputStream is = socket.getInputStream();
                        //判断是否存在该文件
                        File file = new File("d:\\test\\UpLoad");
                        while(!file.exists()){
                            file.mkdirs();
                        }
                        //自定义文件的存储格式
                        String fileName = "itcatst"+System.currentTimeMillis()+new Random(999999).nextInt();
                        FileOutputStream fos = new FileOutputStream(file+"\\"+fileName+".jpg");
                        //读
                        int len =0;
                        byte [] bytes = new byte[1024];
                        while((len = is.read(bytes)) != -1){
                            fos.write(bytes,0,len);
                        }

                        //写
                        OutputStream os = socket.getOutputStream();
                        os.write("hello, 客户端， 我收到了".getBytes());
                        fos.close();
                        socket.close();
                    }catch (IOException e){
                        e.printStackTrace();
                    }finally {
                        try {
                            socket.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }).start();

        }
        //server.close();
    }

}

package cn.itcast.day11.demo01TCP;

/*
ServerSocket(int port, int backlog)  利用指定的 backlog 创建服务器套接字并将其绑定到指定的本地端口号。
 */

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

//创建服务器
public class TCPServer {

    public static void main(String[] args) throws IOException {
        //创建一个ServerSocket对象， 端口读取Socket客户端输入的端口
        ServerSocket server = new ServerSocket(8888);
        //调用ServerSocket 对象中的accept（）方法， 用来接收Socket
          Socket socket = server.accept();

        //.使用Socket对象中的getInputStream（）获取网络字节输入流Inputstream对象
        InputStream is  = socket.getInputStream();

        //读取客户端的信息
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        System.out.println(new String (bytes, 0,len));
       /* byte[] bytes = new byte[1024];
        int len = 0;
        while((len = is.read(bytes)) != -1){
            System.out.println(new String(bytes,0,len));
        }*/

        OutputStream os  = socket.getOutputStream();
        os.write("收到谢谢".getBytes());
        socket.close();
        server.close();

    }
}

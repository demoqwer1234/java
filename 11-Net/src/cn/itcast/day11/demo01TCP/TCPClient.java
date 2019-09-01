package cn.itcast.day11.demo01TCP;

/*
      Socket(InetAddress address, int port, InetAddress localAddr, int localPort)  创建一个套接字并将其连接到指定远程地址上的指定远程端口。
 */
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/*
    创建客户端
 */
public class TCPClient {

    public static void main(String[] args) throws IOException {
        //1.创建一个客户端对象Socket  ， 构造方法绑定服务器的IP地址和端口号
        Socket socket = new Socket("127.0.0.1",8888);       //自己主机的ip地址， 随便给的端口号

        //2.使用Socket对象中的方法，getOUtoutstream()获取网络字节输出流OUtputStream对象
        OutputStream os =   socket.getOutputStream();

        //3.使用网络字节输出流OutputStream对象中的write（）方法， 给服务器发送数据
        os.write("你好，服务器".getBytes());

        //4.使用Socket对象中的getInputStream（）获取网络字节输入流Inputstream对象
        InputStream is = socket.getInputStream();

        //5.使用网络字节输入流InputStream对象中的read（）方法，读取服务器回写的数据
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        System.out.println(new String(bytes,0,len));

        //下面这种读取方法，会是服务器一直读取信息， 导致客户端接收不到，一直在运行   （只适用于读取文件信息）
        /*byte[] bytes = new byte[1024];
        int len = 0;
        while((len = is.read(bytes)) != -1){
            System.out.println(new String(bytes,0,len));
        }*/

        //释放资源
        socket.close();
    }

}

package cn.itcast.day11.demo02FileUpload;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TcpClient {

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 8880);
        OutputStream os = socket.getOutputStream();

        long e= System.currentTimeMillis();

        //将本地文件上传给客户端
        FileInputStream fis = new FileInputStream("d:\\test\\aa.jpg");
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = fis.read(bytes)) != -1) {
            os.write(bytes);
        }
        /*
            使用一个结束标志结束死循环
              void shutdownOutput() 禁用此套接字的输出流
         */
        socket.shutdownOutput();    //结束死循环

        //读取服务器的数据
        InputStream is = socket.getInputStream();
        while((len = is.read(bytes)) != -1){
            System.out.println(new String (bytes,0,len));
        }

        //释放资源
        fis.close();
        socket.close();

        long s = System.currentTimeMillis();
        System.out.println("耗时：" +(s-e)+"毫秒");

    }
}

package cn.itcast.day11.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/*
    需求说明：创建新项目，按以下要求编写代码：
        在项目下创建TCP 客户端
        访问之前创建的服务器端,服务器端ip127.0.0.1 端口号8888
        1:客户端连接服务器,并发送 hello.服务器,我是客户端.
        2:开启上一题服务器,等待客户端连接,客户端连接并发送数据

 */
public class Demo01TcpClient {

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",8888);

        //计算上传的时间
        long e = System.currentTimeMillis();
        //读取本地文件
        FileInputStream fis = new FileInputStream("d:\\test\\aa.jpg");
        OutputStream os = socket.getOutputStream();
        int len =0;
        byte [] bytes = new byte[1024];
        while((len = fis.read(bytes)) != -1){
            //写给服务器
            os.write(bytes,0,len);
        }
        //使用Socket对象中的shutdownOutput（）方法， 结束网络输出流
        socket.shutdownOutput();

        //读
        InputStream is = socket.getInputStream();
         len =0;
        while((len = is.read(bytes)) != -1){
            System.out.println(new String (bytes,0,len));
        }

        fis.close();
        socket.close();

        long s = System.currentTimeMillis();
        System.out.println("耗时：" +(s-e)+"毫秒");
    }

}

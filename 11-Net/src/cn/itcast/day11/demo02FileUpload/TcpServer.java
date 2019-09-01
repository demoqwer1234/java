package cn.itcast.day11.demo02FileUpload;

/*
    综合案例：
         文件上传案例
 */

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class TcpServer {

    public static void main(String[] args) throws IOException {
        //创建一个ServerSocket对象， 端口读取Socket客户端输入的端口
        ServerSocket server = new ServerSocket(8880);

        /*
            让服务器一直处于被监听状态（死循环accept（）方法）
            又一个客户端上传文件， 就保存一个
         */
        while(true){
            //调用ServerSocket 对象中的accept（）方法， 用来接收Socket
            Socket socket = server.accept();

            /*
                使用多线程技术， 提高程序的效率
                又一个客户端上传文件就开启一个线程
             */
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try{
                        //判断是否存在该路径
                        File file = new File("d:\\test\\UpLoad");
                        if (!file.exists()){
                            file.mkdirs();

                        }
                        //读取客户端发送的数据 并存储到硬盘
                        /*
                            优化存储路径， 自定义一个储存方法
                                规则：域名+毫秒值+随机数
                        */
                        String fileName = "itcast"+System.currentTimeMillis()+new Random(999999).nextInt();
                        FileOutputStream fos = new FileOutputStream(file+"\\"+fileName+".jpg");    //自定义的文件储存路径
                        InputStream is = socket.getInputStream();
                        byte[] bytes = new byte[1024];
                        int  len = 0;
                        while((len = is.read(bytes)) != -1){
                            fos.write(bytes,0,len);
                        }

                        //回复客户端上传成功，
                        OutputStream os = socket.getOutputStream();
                        os.write("上传成功".getBytes());

                        //释放资源
                        fos.close();
                    }catch (IOException e){
                        System.out.println(e);
                    }
                    finally {
                        //释放资源
                        try {
                            socket.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }).start();
        }
        //最后服务器就不用关闭了
        //server.close();
    }

}

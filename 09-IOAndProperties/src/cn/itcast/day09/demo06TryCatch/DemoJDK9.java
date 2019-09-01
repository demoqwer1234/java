package cn.itcast.day09.demo06TryCatch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
执行catch后不需要关闭流， 自动会进行关闭
    JDK9 新特性
    A a = new A()
    B b = new B()
    try(a,b){
            可能出现异常的代码
    }catch(异常类变量  变量名){
               异常处理逻辑
    }
 */
public class DemoJDK9 {

    public static void main(String[] args) throws IOException {
        //读取数据源
        FileInputStream fis = new FileInputStream("d:\\Test\\aa.jpg");
        //写入目的
        FileOutputStream fos = new FileOutputStream("d:\\Test\\a\\a.jpg");

        try(fis;fos){
            //使用数据缓冲区      效率高
            byte []bytes = new byte[1024];
            int len =0;
            while((len = fis.read(bytes)) != -1 ){
                fos.write(bytes);
            }
        }catch (IOException e){
            System.out.println(e);
        }

      //  fos.write(100);    //Stream Closed

    }

}

package cn.itcast.day09.demo06TryCatch;

/*
        JDk7新特性
        try(定义流对象；定义流对象){
            可能出现异常的代码
        }catch(异常类变量  变量名){
               异常处理逻辑
        }
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoJDK7 {

    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("d:\\Test\\aa.jpg");
            //写入目的
            FileOutputStream fos = new FileOutputStream("d:\\Test\\a\\a.jpg");){

            //使用数据缓冲区      效率高
            byte []bytes = new byte[1024];
            int len =0;
            while((len = fis.read(bytes)) != -1 ){         //共耗时32毫秒
                fos.write(bytes);
            }
        }catch (IOException e){
            System.out.println(e);
        }



    }

}

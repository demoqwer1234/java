package cn.itcast.day09.demo06TryCatch;

import java.io.FileWriter;
import java.io.IOException;

public class Demo01TryCatch {

    public static void main(String[] args)  {

        FileWriter fw =null;    //提高资源的利用率，
        try {
             fw = new FileWriter("d:\\test\\d.txt");
            for (int i = 0; i < 10; i++) {
                fw.write("hello"+i+"\r\n");
            }
        }catch (IOException e){
            System.out.println(e);
        }finally {
            if(fw != null){            //需要进行一个限定， 防止抛出空指针异常
                try {
                    fw.close();                     //NullPointerException
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }




    }

}

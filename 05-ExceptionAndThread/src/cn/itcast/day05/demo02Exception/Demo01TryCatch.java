package cn.itcast.day05.demo02Exception;

import java.io.IOException;

public class Demo01TryCatch {                 //try -- catch

    public static void main(String[] args) throws Exception{
        try{
            readFile("c\\a.xt");
        }catch(IOException e ){
            System.out.println(e.getMessage());      //getMessage
            System.out.println(e.getMessage());     //getMessage

            e.printStackTrace();             //最全面  printStackTrace


        }

        System.out.println("catch -- 后续文件");

    }

    private static void readFile(String fileName)  throws Exception{
        if(!fileName.endsWith("c\\a.txt")){
            throw new IOException("文件后缀有误");
        }
        System.out.println("后续文件");
    }


}

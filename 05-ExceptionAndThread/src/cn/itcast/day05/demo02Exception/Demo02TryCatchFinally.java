package cn.itcast.day05.demo02Exception;

import java.io.IOException;

public class Demo02TryCatchFinally {

    public static void main(String[] args) {
        try {
            readFile("c:\\a.ttxt");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            System.out.println("资源释放");
        }
    }

    private static void readFile(String fileName) throws IOException {
        if (!fileName.endsWith(".txt")){
            throw new IOException("后缀名有误");

        }
    }


}

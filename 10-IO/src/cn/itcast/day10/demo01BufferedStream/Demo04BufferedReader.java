package cn.itcast.day10.demo01BufferedStream;

/*BufferedReader
        java.io.BufferedReader  extends Reader
            特有方法:
                    readLine()  一行一行的读取  ，不存在则返回null

 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Demo04BufferedReader {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("d:\\test\\a.txt"));

       /* String line = br.readLine();
        System.out.println(line);
        line = br.readLine();
        System.out.println(line);
        line = br.readLine();
        System.out.println(line);
        line = br.readLine();
        System.out.println(line);
        line = br.readLine();
        System.out.println(line);
        line = br.readLine();
        System.out.println(line);*/

       //readLine()
      /* String line = new String();
       while((line = br.readLine()) != null){
           System.out.println(line);
       }*/

        System.out.println("============");

       int len = 0;
       char[] cs = new char[1024];
       while((len= br.read()) != -1){
          System.out.println(new String (cs));
          // System.out.print((char)len);
       }


        //释放资源
        br.close();
    }

}

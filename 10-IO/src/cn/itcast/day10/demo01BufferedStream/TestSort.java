package cn.itcast.day10.demo01BufferedStream;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestSort {

    public static void main(String[] args) throws IOException {
        BufferedReader br  = new BufferedReader(new FileReader("d:\\test\\test.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("d:\\test\\success.txt"));

        HashMap<String, String> map= new HashMap<>();

        String line ;
        while((line = br.readLine()) != null){
            String[] arr = line.split("\\.");//用split（）方法  对每行的文本进行切割， 以" . " 作为分割
            //map中的键值会自动排序
            map.put(arr[0],arr[1]);      //分别把键值放入map集合中
        }

        for(String key : map.keySet()){
            String value = map.get(key);
            line = key+"."+value;
            bw.write(line);
            bw.newLine();
        }

        br.close();
        bw.close();
    }

}

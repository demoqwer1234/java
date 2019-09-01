package cn.itcast.day12.DemoTest3;

public class Demo {

    public static void decToHex(int num ,NumberToString nts){
        String res = nts.conver(num);
        System.out.println(res);
    }

    public static void main(String[] args) {
        int num =15;
        /*decToHex(16, new NumberToString() {
            @Override
            public String conver(int num) {
                return Integer.toHexString(num);        //把十进制转化为十六进制
            }
        });
*/
        //使用Lambda简化后
        decToHex(num,(int n)->Integer.toHexString(n));   //把十进制转化为十六进制

      //  decToHex(num,Integer ::toHexString);       //把十进制转化为十六进制
    }

}

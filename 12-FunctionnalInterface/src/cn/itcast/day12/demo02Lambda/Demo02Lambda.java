package cn.itcast.day12.demo02Lambda;

/*
    使用lambda对日志优化：
        Lambda特点： 延迟加载
        Lambda的使用前提 ， 必须存在函数式接口
 */

public class Demo02Lambda {

    public  static void showLog(int level, demo02Lambda.MessgeBuilder mb){
        if (level ==1){
            System.out.println(mb.show());

        }
    }

    public static void main(String[] args) {
        String msg1= "hello";
        String msg2 = "World";
        String msg3 = "java";

        showLog(1,()-> {
            System.out.println("不满足条件不执行");
            return msg1+msg2+msg3;
        });

        showLog(2,()-> {
            System.out.println("不满足条件不执行");
            return msg1+msg2+msg3;
        });
    }

}

package cn.itcast.day14.junit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CaculatorTest {

    //初始化方法：
//        用于资源申请， 所有资源执行之前执行
    @Before
    public void init(){
        System.out.println("init....");
    }
    //释放资源方法， ：
//        在所有测试类，执行完后执行
    @After
    public void close(){
        System.out.println("close....");
    }

    @Test
    public void testAdd(){
        Caculator c = new Caculator();
        int a  =1, b=2;
        int res = c.add(a, b);
        System.out.println("add....");
        //断言
        Assert.assertEquals(3,res);       //assertEquals ()方法， 断言程序的正确与否
    }
    @Test
    public void testSub(){
        Caculator c= new Caculator();
        int res = c.sub(100, 1);
        System.out.println("sub....");
        Assert.assertEquals(99,res);      //期望与实际不符合
    }

}

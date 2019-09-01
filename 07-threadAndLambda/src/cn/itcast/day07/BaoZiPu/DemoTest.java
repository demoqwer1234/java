package cn.itcast.day07.BaoZiPu;

public class DemoTest {

    public static void main(String[] args) {
        BaoZi bz = new BaoZi();
        BaoZiPu bzp = new BaoZiPu(bz);
        ChiHuo ch = new ChiHuo(bz);
        bzp.start();
        ch.start();
    }

}

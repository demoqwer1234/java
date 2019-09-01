package cn.itcast.day13.demo09ArrayMethodReference;

@FunctionalInterface
public interface ArrayBuilder {

    public abstract int[] buildArray(int len);
}

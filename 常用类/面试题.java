package 常用类;

public class 面试题 {
    public static void main(String[] args) {
//        下列代码创建了几个对象??
        String s1 = new String("hello");
        String s2 = new String("hello");

//        3个对象
//        两个堆内存(new)  一个方法区中的字符串常量对象("hello")
    }
}

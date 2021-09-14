package 多线程;

public class Thread_Test01 {
//    分析一下 有几个线程 除gc(垃圾回收线程)
//    只有 一个线程 因为只有一个栈 就是main方法 main调用了m1 m1调m2 ...
public static void main(String[] args) {
    System.out.println("main begin");
    m1();
    System.out.println("main over");

}

    private static void m1() {
    System.out.println("M1 BEGIN");
    m2();
    System.out.println("m1 over");
    }

    private static void m2() {
        System.out.println("M2 BEGIN");
        m3();
        System.out.println("m2 over");
    }

    private static void m3() {
    System.out.println("m3 执行了");
    }
}

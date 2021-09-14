package 测试;

public class test3_tstatic {
    public static void main(String[] args) {
//        调用静态方法
       test3_tstatic.main(10);
    }
//重载
    public static void main(int i) {
System.out.println(i);
main("hello world");
    }

    public static void main(String args) {
        System.out.println(args);
    }
}

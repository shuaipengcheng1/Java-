package 测试;

public class test2_static {
//    静态代码块
    static {
        System.out.println("静态代码");
}
static {
        System.out.println("静态代码2");
}

    public static void main(String[] args) {
        System.out.println("main");
    }
}

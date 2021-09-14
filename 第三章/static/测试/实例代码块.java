package 测试;

public class 实例代码块 {
    {
        System.out.println("实例代码块1");
    }
    {
        System.out.println("实例代码块2");
    }
    {
        System.out.println("实例代码块3");
    }
    public static void main(String[] args) {
        System.out.println("main");
//        执行实例代码块
      实例代码块 s=  new 实例代码块();
    }
}

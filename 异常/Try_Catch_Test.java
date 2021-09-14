package 异常;

//什么是异常 有什么用
// 可以得到错误原因
public class Try_Catch_Test {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        int c = a / b; //在这里 其实 JVM 创建了一个(new) 错误类对象
        System.out.println(c); //如果除数位0 就会异常Exception in thread "main" java.lang.ArithmeticException: / by zero

    }
}

package 异常;

public class Error_Test2 {
//    创建异常对象
public static void main(String[] args) {
    NullPointerException nullPointerException = new NullPointerException("空指针异常");
    System.out.println(nullPointerException); //java.lang.NullPointerException: 空指针异常
//    所以我们得知 java中 所有的异常都是类 并且 都可以实例化
}
}

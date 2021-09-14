package 异常;

public class Error_Test07 {
//    异常对象(Exception e) 有两个非常重要的方法
//     String msg = e.getMessage()  打印错误信息
//    e.printStackTrace() 打印异常追踪的堆栈信息
public static void main(String[] args) {
    try{
        System.out.println(100/0);
    }catch (Exception e){
String msg = e.getMessage() ;
System.out.println(msg); /// by zero
//这个打印是异步的 不是同步函数 所以会有 延迟 以后看java是否有async 和 await
        e.printStackTrace();      /*
        * java.lang.ArithmeticException: / by zero
	at 异常.Error_Test07.main(Error_Test07.java:9)*/

        for (int i = 0; i <1000 ; i++) {
            System.out.println("i = "+i);
        }
        System.out.println("hello");
    }
}
}

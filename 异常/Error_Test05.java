package 异常;

public class Error_Test05 {

//    在 Test04中我们使用的时 try catch 解决的 这一次 使用 throw 来解决
    public static void main(String[] args) throws ClassNotFoundException {

            dosome();

    }
    //    dosome方法 在函数声明上面 throw 了 ClassNotFound 标识 dosome方法中 有可能会出现该异常 并且该异常位编译时异常 必须在使用时 要对其进行处理 例如使用 tryCatch包围
    public static  void dosome() throws ClassNotFoundException {
        System.out.println("dosome");
// new F();
    }
}

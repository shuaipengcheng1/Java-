package 异常;

public class Error_Test04 {
    public static void main(String[] args) {
        try {
            dosome(); //未处理 异常: java.lang.ClassNotFoundException
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
//            System.out.println("出错了");
        }
    }
//    dosome方法 在函数声明上面 throw 了 ClassNotFound 标识 dosome方法中 有可能会出现该异常 并且该异常位编译时异常 必须在使用时 要对其进行处理 例如使用 tryCatch包围
    public static  void dosome() throws ClassNotFoundException {
        System.out.println("dosome");
// new F();
    }
}

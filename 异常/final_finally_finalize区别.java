package 异常;

public class final_finally_finalize区别 {
    public static void main(String[] args) {
//        1 final final是一个关键词 表示常量
        final  int i =100;
//        i=101;  报错 不能修改
//        2 finally 是一个try catchd的一个代码块 在该代码块中的代码 是一定会执行的
        try {

        }finally {
            System.out.println("finally");
        }
//        3 finalize()是Object 中的一个方法 作为方法出现
//        标识符
//    finalize方法不需要我们调用 JVM的垃圾回收器负责调用该方法
//当java对象 即将被回收的时候 就会调用
//    finalze方法实际上是sun公司为java程序员准备的一个生命周期(时机) 垃圾烧毁时机 如果希望在对象销毁时 执行代码 这段代码写在finalize中
//    与静态代码块很像
//    static{}  静态代码块 触发时机是在 类加载时触发
        Object obj; //    protected void finalize() throws Throwable { }
    }
}

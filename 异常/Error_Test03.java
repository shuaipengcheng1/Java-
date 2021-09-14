package 异常;

public class Error_Test03 {
//    异常 结构
//    UML??
//    统一建模语言(画图的)


//    所有的错误 只要发生 就会终止运行 是不能被处理的
//    Object下面有 Error不可以处理异常 和 Exprection 可处理异常
//    可处理下面 又有 runtimeError(运行时异常(空指针 数据转换...))  和 exprectionError(编译异常 编译时报错(语法))

//    java语言 对于异常的处理 可以使用两种 方式 1 throw 抛给上一级 2 try{}catch(){} 对异常捕捉

//   如果使用 throw 抛出错误给上一级main方法  但是没有解决的话 最后会抛给jvm 最后就会终止程序

    public static void main(String[] args) {
//           System.out.println(100/0); //在这里 java new了一个错误类 并且throw了
        try {
            System.out.println(100/0); //try 里面的代码块报错  所以将会执行catch代码块里面的语句 并且该错误类 是继承的RunTimeException 属于运行时异常 所以不会在编译阶段报错
        }catch (Exception e){
            System.out.println(100/10);

        }
           System.out.println("hello world");
    }







}


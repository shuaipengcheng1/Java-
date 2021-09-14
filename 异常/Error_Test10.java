package 异常;

public class Error_Test10 {
//    如果 try中没有 catch 只有finnaly可以吗 答案是 可以


//    一下代码的顺序
//    try
//    finally
//    return(main函数结束) 不管返回在哪一行 永远都是 最后执行

public static void main(String[] args) {
    try {
        System.out.println("try..");
//        return;
//        但是 使用 下面这一条 就会不执行 并且直接结束
System.exit(0); //退出 jvm

    }finally {
        System.out.println("finally..."); //是否会执行 ? 会   即使try 使用return 也就是结束程序 但是finally任然会执行

    }

//    System.out.println("xxx"); //报错 因为已经return了
}
}

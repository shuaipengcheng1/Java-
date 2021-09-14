package 异常;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
/*
*无错误时
*main start
m1 start
m2 start
m2 end
m1 end
main over
*
* 有错时
*
* main start
m1 start
m2 start
文件没有找到 //执行到m2函数时 类发生错误 并且上抛给 m1 m1上抛给main main不再继续上抛 使用tyrcatch拦截 并且打印文字
main over
* */


//一般不建议 在 main方法 上使用 throw 因为一定会抛给 Jvm 程序就会终止
//异常处理 机制 的 作用 就是 增强 程序的 健壮性
// 因为使用 trycatch 和 throw 可以 做到 就算发生错误 也不会 终止 程序的运行
public class Error_Test06 {
    public static void main(String[] args) {
        System.out.println("main start");
        try {
            m1();
        } catch (FileNotFoundException e) {
            System.out.println("文件没有找到");
        }

        System.out.println("main over");

    }

    public static void m1() throws FileNotFoundException {
        System.out.println("m1 start");
//        将错误上抛
        m2();
        System.out.println("m1 end");
    }

    public static void m2() throws FileNotFoundException {
//        使用一个类 来讲述错误的处理
//        以后会在I/O流中介绍 看起来有点像 nodejs 的 readFile(url,(err,data)=>{}data是buffer)
//        该类 也要指向一个路径
        System.out.println("m2 start");

//        并且将错误上抛
        new FileInputStream("C:\\Users\\misak\\Desktop\\新建文本文档.txt");
        System.out.println("m2 end");
    }
}

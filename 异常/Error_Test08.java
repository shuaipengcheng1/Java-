package 异常;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Error_Test08 {
    public static void main(String[] args) {
        try {
            m1();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            /*

//    如何解析 获取的信息?? 从上往下看 其中1很重要 2-5都是sun公司写的函数不用看 6开始是自己的函数
  1          * java.io.FileNotFoundException: c (系统找不到指定的文件。)
2	at java.io.FileInputStream.open0(Native Method)
3	at java.io.FileInputStream.open(FileInputStream.java:195)
4	at java.io.FileInputStream.<init>(FileInputStream.java:138)
5	at java.io.FileInputStream.<init>(FileInputStream.java:93)
6	at 异常.Error_Test08.m3(Error_Test08.java:39)
7	at 异常.Error_Test08.m2(Error_Test08.java:35)
8	at 异常.Error_Test08.m1(Error_Test08.java:31)
9	at 异常.Error_Test08.main(Error_Test08.java:9)
            * */
        }

        System.out.println("hello"); //改行代码 就算是上面的trycatch发生错误了也不会停止运行 所以trycatch的作用 就是错误时 也不停止运行
    }

    private static void m1() throws FileNotFoundException {
        m2();
    }

    private static void m2() throws FileNotFoundException {
        m3();
    }

    private static void m3() throws FileNotFoundException {
        new FileInputStream("C");
    }

}

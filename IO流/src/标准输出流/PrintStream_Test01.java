package 标准输出流;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

//PrintStream 标准的字节输出流  默认输出到控制台
public class PrintStream_Test01 {
    public static void main(String[] args) {
        System.out.println("hello world");
       PrintStream p= System.out; //SYstem.out对象返回的是PrintStream对象
        p.println("hello");
//
//        PrintStream 这个流 不需要关闭

//        可以改变出错方向吗
        try {
//            SetOut 要接收一个PrintStream流 作为参数 而标准输出流又要接收一个FileOutputStram作为参数 这样使用以后
            //标准输出流 就不会指向 控制台 而是指向 输出流指定的文件
            PrintStream pp =new PrintStream(new FileOutputStream("D:\\java\\IO流\\src\\Systemout.txt"));
            System.setOut(pp);
            pp.println("hello world"); //打印到Systemout文件里面了 可以用于打log
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

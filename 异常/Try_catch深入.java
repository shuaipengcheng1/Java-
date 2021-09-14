package 异常;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Try_catch深入 {
//    先看throw的几种方法

//    1 抛出多种可能的错误
//public  static  void    dosome() throws NullPointerException ,ClassNotFoundException {
//
//}
//    2 单个抛出
//    public  static  void    dosome() throws NullPointerException  {
//
//    }



//    try catch深入~~~
public static void main(String[] args) {

//    1
//    try {
//        new FileInputStream("C:\\Users\\misak\\Desktop\\新建文本文档.txt");
//    }catch (FileNotFoundException e){
////这里的e就是 new 的 FileNotFoundException 产生的错误类
////        e是一个引用 所以在输出时 会调用 toString()
//        System.out.println(e);
//    }


//    2 使用 io异常 也可以 因为 FileNotFoundException 是 ioException 的子类 使用了多态 父类指向子类对象 还可以写为Exception 指向 File.. 因为也是多态
//    try {
//        new FileInputStream("C:\\Users\\misak\\Desktop\\新建文本文档.tx");
//    }catch (IOException e){
////这里的e就是 new 的 FileNotFoundException 产生的错误类
////        e是一个引用 所以在输出时 会调用 toString()
//        System.out.println(e);
//    }


//    3 多个 错误 可以使用 多个catch
//        try {
//  FileInputStream fis=      new FileInputStream("C:\\Users\\misak\\Desktop\\新建文本文档.txt");
//
//        fis.read(); //这里也有抛出 IOException 而 catch中没有该类的父类 或者 本身 所以报错
//    }catch (FileNotFoundException e){
////这里的e就是 new 的 FileNotFoundException 产生的错误类
////        e是一个引用 所以在输出时 会调用 toString()
//        System.out.println(e);
//    }catch (IOException e){
//            System.out.println(e);
//        }
////        catch (FileNotFoundException e){
////            报错 因为 上面 已经有捕捉了他的父类 IOException 这里就会报错
////        }



//    4 jdk8 新特性 使用 | 符号 代表或  从而判断多个错错误 而不需要嵌套catch 使代码更加简洁
    try {
        System.out.println(100/0);
    }catch (ArithmeticException | NullPointerException  e ){
System.out.println(e);
    }



}
}

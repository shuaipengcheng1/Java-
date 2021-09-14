package File;

import java.io.File;
import java.io.IOException;

public class Flie_Test01 {
//    File 文件和目录路径名抽象的表达方式 没有读写文件的功能 因为没有继承FileOutputSteam 或者 FileInputSteam

//    C://Drivers 这是一个file对象

//    常用方法
public static void main(String[] args) {
    File file = new File("D:\\新建文件夹");
   //判断指向的文件路劲 是否存在
    System.out.println(  file.exists()); //true
    File file1 = new File("D:\\x");
    System.out.println(file1.exists());//false
//    如果不存在 则以文件的方式创建一个
//    if(!(file1.exists())){
//        try {
////            创建一个
//            file1.createNewFile();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

//    如果不存在 就创建一个文件夹
    if(!(file1.exists())){
        file1.mkdir();
    }

//    创建多层目录
    File file2 = new File("D:\\s\\ss\\x\\x\\x");
    if(!(file2.exists())){
        file2.mkdirs(); //创建多层目录
    }

//    获取指向文件的父路径 以字符串类型返回
    String str = file2.getParent();
    System.out.println(str); //D:\s\ss\x\x
//    获取父路径 返回File
    File file3 = file2.getParentFile();
    System.out.println(file3.getParent()); //D:\s\ss\x
//    获取指向文件的绝对路劲
    System.out.println(file3.getAbsolutePath()); //D:\s\ss\x\x
   System.out.println(new File("Log").getAbsolutePath()); //D:\java\Log
}
}

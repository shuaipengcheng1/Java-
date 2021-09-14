package BufferWriter;

import java.io.*;

public class Buffer_Retest {
//    复习
//    buffered类型 的 io流 都拥有自己的缓存 不需要自定义 char[] or byte[]
//    bufferd都是一种包装流 要接受一个字符流 作为内部流 字节流 则需要转换
public static void main(String[] args) {
    BufferedWriter bufferedWriter=null;
    BufferedWriter bufferedWriter1=null;

    BufferedReader bufferedReader=null;
    try {
        //    将FileReader作为内部流
        bufferedWriter= new BufferedWriter(new FileWriter("D:\\java\\IO流\\src\\Writer.txt",true));
//  写人 直接写入字符串
        bufferedWriter.write("\nBuffered_Retest\n");
        bufferedWriter.flush();

//        读取
  bufferedReader = new BufferedReader(new FileReader("D:\\java\\IO流\\src\\Writer.txt"));
//  读取直接返回一个字符串 不需要 定义数组
//        并且一次可以读取一行 并且读取完时 返回null
        String str = null;
       while ((str=bufferedReader.readLine())!=null){
            System.out.println(str);
        }

//       使用字节流时 要使用流转换  比如FileOutputStream 就用 OutputStreamWriter
        bufferedWriter1 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("D:\\java\\IO流\\src\\Writer.txt",true)));
       bufferedWriter1.write("\n类型转换\n");
       bufferedWriter1.flush();


    } catch (Exception e) {
        e.printStackTrace();
    }finally {
        try {
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            bufferedWriter1.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
}

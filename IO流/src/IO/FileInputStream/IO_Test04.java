package IO.FileInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
* FileInputStream 最终版
* */
public class IO_Test04 {
  static   FileInputStream fileInputStream;
    public static void main(String[] args) {
        try {
            fileInputStream = new FileInputStream("D:\\java\\IO流\\src\\io.txt");
//            通过Byte数组方式读取 一次读取byte数组长度的字节
            byte[] bytes = new byte[10]; //一次读取10个字节
            int data=0;
            while ((data=fileInputStream.read(bytes))!=-1){
                System.out.println(new String(bytes,0,data));//new String 将byte数组转为String 并且提供了起始下标和结束下标
//                                                                防止打印结果不理想
//                结果
                   //Hello Java
                  //!!
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(fileInputStream!=null){
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

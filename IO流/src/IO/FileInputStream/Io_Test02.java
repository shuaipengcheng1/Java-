package IO.FileInputStream;

import java.io.FileInputStream;
import java.io.IOException;
/*
* 一次读取 一个字节 太慢
* */
public class Io_Test02 {
    static FileInputStream fileInputStream = null;

    public static void main(String[] args) {
        try {
            fileInputStream = new FileInputStream("D:\\java\\IO流\\src\\io.txt");
//            循环读取
//            while (true){
//                int data =   fileInputStream.read();
//
//                if(data==-1){
//                    break;
//                }
//         System.out.println((char) data);
//            }

//            改造循环
            int data =0;
//            当 该值不被赋值为-1时 while就循环 为-1了 就结束
            while ((data = fileInputStream.read())!=-1){
                System.out.println((char) data);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}

package FileOutPutStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy_Test {
//    使用nodejs的复制原理
  static   FileOutputStream fileOutputStream;
  static FileInputStream fileInputStream;
    public static void main(String[] args) {
//        先读取
        try {
            fileInputStream  = new FileInputStream("D:\\java\\IO流\\src\\FileOutPutStream\\logo.png");
//            获取大小
           int size= fileInputStream.available();
//            读取
            byte[] bytes =new byte[size];
//            读取完毕 数据存入了byte数组中
            fileInputStream.read(bytes);
//            写入
            fileOutputStream = new FileOutputStream("D:\\java\\IO流\\src\\FileOutPutStream\\logo_copy.png");
            fileOutputStream.write(bytes);
//            清空
            fileOutputStream.flush();

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
            if (fileOutputStream!=null){
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

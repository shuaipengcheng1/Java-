package FileOutPutStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileOutputSteam_Retest {
//    FileInputStream 输入字符流 相当于读 字节流
//   复习  FileOutputStream 输出字节流 输出  字节流 万能流 可以读取任意文件
    public static void main(String[] args) {
FileInputStream fileInputStream=null;
FileOutputStream fileOutputStream =null;

        try {
            //        读
        fileInputStream =new FileInputStream("D:\\java\\IO流\\src\\FileOutPutStream\\logo.png");
            //        写
                    fileOutputStream = new FileOutputStream("D:\\java\\IO流\\src\\FileOutPutStream\\logo_Retest.png");
//                    定义每次读取大小
            byte[] bytes =new byte[fileInputStream.available()];
//            读取
            fileInputStream.read(bytes);
//            写入
            fileOutputStream.write(bytes);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

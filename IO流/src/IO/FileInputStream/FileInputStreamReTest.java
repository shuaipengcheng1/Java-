package IO.FileInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamReTest {
//    复习 FileInputStream
//    输入字节流 等于 读 FileReader

    public static void main(String[] args) {
        FileInputStream fileInputStream=null;
        try {
            fileInputStream = new FileInputStream("D:\\java\\IO流\\src\\Writer.txt");
//            读取
            byte[] bytes= new byte[fileInputStream.available()];
            fileInputStream.read(bytes);
            String re = new String(bytes);
            System.out.println(re);
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

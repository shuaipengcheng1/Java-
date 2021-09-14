package IO.FileInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IO_ReTest {
    static   FileInputStream fileInputStream ;

    public static void main(String[] args) {
//        复习2
        try {
            fileInputStream = new FileInputStream("D:\\java\\IO流\\src\\io.txt");
//            循环读取
            byte[] bytes = new byte[10];
            int data=0;
            while ((data=fileInputStream.read(bytes))!=-1){
                System.out.println(new String(bytes,0,data));
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

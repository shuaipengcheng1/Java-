package IO.FileInputStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_Test {
//    字符流 只能读取文本
//    变成了char数组
    static FileReader fileReader;
public static void main(String[] args) {
    try {
        fileReader = new FileReader("D:\\java\\IO流\\src\\io.txt");
//        读取
        char[] chars =new char[10];
        int length=0;
        while ((length=fileReader.read(chars))!=-1){
            System.out.println(new String(chars,0,length));
//            ghijghijgh
//            ijghij我是中国
//            人
        }

    } catch (Exception e) {
        e.printStackTrace();
    }finally {
        if(fileReader!=null){
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
}

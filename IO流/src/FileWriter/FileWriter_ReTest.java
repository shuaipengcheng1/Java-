package FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_ReTest {
//    复习
//    FileWriter 字符流 写入  只能写入文本文件 如果文件不存在 则自动创建
public static void main(String[] args) {
    FileWriter fileWriter = null;
    try {
        fileWriter = new FileWriter("D:\\java\\IO流\\src\\Writer.txt",true);
//        写入char数组
        char[] chars ={97,98,99};
       fileWriter.write(chars);
//       写入String
        fileWriter.write("hello world\n");
        fileWriter.flush();
    } catch (IOException e) {
        e.printStackTrace();
    }finally {
        try {
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
}

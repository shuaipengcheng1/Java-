package FileWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_Test01 {
//    文件字符输出流 负责写 只能写文本文件
  static FileWriter fileWriter = null;

    public static void main(String[] args) {
        try {
//            不存在的文件 会自动创建 也是在实例化时传入布尔值 来决定是否覆盖源文件
            fileWriter = new FileWriter("D:\\java\\IO流\\src\\Writer.txt",true);
//            写入char数组
            char[] chars = {'我','是','一','个','中','国','人',' ','\n'};
            fileWriter.write(chars);
//            写入字符串
            String s ="我是java";
            fileWriter.write(s);
            fileWriter.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(fileWriter!=null){
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

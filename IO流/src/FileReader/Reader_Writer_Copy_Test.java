package FileReader;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Reader_Writer_Copy_Test {
//    使用fileReader FileWriter 复制文件
public static void main(String[] args) {
    FileWriter fileWriter=null;
    FileReader fileReader=null;
    try {
//        写
 fileWriter = new FileWriter("D:\\java\\IO流\\src\\Writer_Copys.txt");
//        读
      fileReader  =new FileReader("D:\\java\\IO流\\src\\Writer.txt");
//        将读取的数据写入
      char[] chars=  new char[1024*2];
        int data=0;
//        循环
  while ((data=fileReader.read(chars))!=-1){
//       写入
      System.out.println(data);
      System.out.println(chars);
   fileWriter.write(chars);

   }
  fileWriter.flush();

    } catch (IOException e) {
        e.printStackTrace();
    }finally {
        if(fileReader!=null){
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
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

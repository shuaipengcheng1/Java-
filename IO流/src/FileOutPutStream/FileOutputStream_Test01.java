package FileOutPutStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream_Test01 {
//    输出字节流 负责写
//    从内存到硬盘 相当于nodejs里面的 fs.writeFile(src,data,(err)=>{}) 并且输出流指定的文件不存在时 会自动新建一个文件


    static   FileOutputStream fileOutputStream;
public static void main(String[] args) {
    try {
      fileOutputStream  = new FileOutputStream("D:\\java\\IO流\\src\\io.txt",true);
      byte[] bytes  = {103,104,105,106};
      fileOutputStream.write(bytes); //输入byte数组的值对应的字符 还可以传入下标指定范围 write()方法会清空源文件! 如果不想清空 则在
//        new FileOutputStream(src,boolean) 第二个参数 就决定了 write方法是否清空源文件 如果为true不清空 默认为false

//        写入一个String
        String s ="我是中国人";
//        字符串对象 转为byte[]
        byte[] bytes1  = s.getBytes();
//        写入
        fileOutputStream.write(bytes1);


//        刷新
        fileOutputStream.flush();
    } catch (Exception e) {
        e.printStackTrace();
    }finally {
        if(fileOutputStream!=null){
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
}

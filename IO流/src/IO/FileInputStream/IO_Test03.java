package IO.FileInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * 一次读取多个字节
 * int read(byte[] b) 一次读取b.length个字节
 *
 * IDEA的默认路径 是工程的所在位置 也就是 D:\\java
 * */
public class IO_Test03 {
    static FileInputStream fileInputStream;

    public static void main(String[] args) {
        try {
            fileInputStream = new FileInputStream("D:\\java\\IO流\\src\\io.txt");
          byte[] b = new byte[5];
          int data =0;
//          read(b) b的长度为2 所以一次读取两个字节 这个方法的返回值 是读取到的字节数量 而不是读取到的值 如果读到了字节
//            就返回读到的值的个数 如果一个值也读不到 就返回-1
          while ((data=fileInputStream.read(b))!=-1){
//              System.out.println(data);
              //5
              //5
              //2
//              将byte数组全部转为String
//              System.out.println(new String(b));
//              Hello
//               Java
//              !!ava   这里 的 两个感叹号替代了空格和J 所以该方法的byte[]不是重写更新 而是覆盖更新
//              String 提供了一个方法 传入起始 和 结束的下标 进行转换
              System.out.println(new String(b,0,data)); //从 0下标 到这次读取的总量 如 0 - 2
//              Hell
//               Java
//              !!
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

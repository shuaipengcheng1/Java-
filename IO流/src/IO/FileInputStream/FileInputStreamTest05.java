package IO.FileInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest05 {
    /*
    * FileInputStream 的其他方法
    * int available() //返回流中 剩余的没有读取的字节数量
    * long skip(long n) //跳过几个字节
    * */
    static FileInputStream fileInputStream ;

    public static void main(String[] args) {
        try {
            fileInputStream = new FileInputStream("D:\\java\\IO流\\src\\io.txt");


            //  一般available 用在 byte[] bytes = new byte[file.available]; 这样就不需要循环了 一次性读完
            byte[] bytes= new byte[fileInputStream.available()];
            int data=  fileInputStream.read(bytes);
            String re=  new String(bytes,0,data);
            System.out.println(re); //Hello Java!!

            System.out.println(fileInputStream.available()); //11 还有11个字节未读




            //            跳过 五个
            fileInputStream.skip(5);
            System.out.println(fileInputStream.available());//6 还有6个未读


        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}

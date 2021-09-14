package DataSttream;

import java.io.*;

public class DataStream_Test1 {
//    数据流 只能 操作数据文件(该文件是记事本打不开的) 存储时会将数据类型存储进去
//    取出时 必须按照一样的顺序取出
public static void main(String[] args) {


    try {
        //    写
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("D:\\java\\IO流\\src\\data"));
        //    读
        DataInputStream dataInputStream= new DataInputStream(new FileInputStream("D:\\java\\IO流\\src\\data"));

//        写入数据
        int a=10;
        char b= '2';
        boolean b1 =true;
        dataOutputStream.writeInt(a);
    dataOutputStream.writeChar(b);
    dataOutputStream.writeBoolean(b1);

//读取 必须按照存取的顺序
     int data=   dataInputStream.readInt();
    char c=    dataInputStream.readChar();
     Boolean b2  =   dataInputStream.readBoolean();
System.out.println(data);
        System.out.println(c);
        System.out.println(b2);
        /*
        * 10
          2
          true
        * */

    } catch (Exception e) {
        e.printStackTrace();
    }
}
}

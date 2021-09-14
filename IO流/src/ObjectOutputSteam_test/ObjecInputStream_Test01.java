package ObjectOutputSteam_test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjecInputStream_Test01 {
//    反序列化
public static void main(String[] args) {
    try {
//        需要传递一个参数  参数为一个InputStream的实现类
        ObjectInputStream objectInputStream= new ObjectInputStream(new FileInputStream("student"));
        Object obj= objectInputStream.readObject();
        System.out.println(obj); //Student{name='misaka', age=11}
    } catch (Exception e) {
        e.printStackTrace();
    }
}
}

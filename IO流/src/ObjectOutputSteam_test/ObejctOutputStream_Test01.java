package ObjectOutputSteam_test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObejctOutputStream_Test01 {
    public static void main(String[] args) {
//        将java对象从内存 放在硬盘文件中 叫做序列化

//      将java对象从硬盘 返回内存 叫做反序列化
//        序列化 Serialize    java对象存储在文件中 将java对象的状态保存下来 的过程 内存->硬盘 ObjectOutputStream
//        反序列化 DeSerialize 将硬盘上的数据重写回复到内存当中 恢复成java对象   硬盘->内存 ObjectInputStream
//        有点类似于 js的本地存储 LocalStorage(key,value)  value SetStorage(key) 但是现在有数据库了

//        创建java对象
        Student student = new Student("misaka", 11);

        try {

//            参数需要OutputStream 接口的实现类
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("student"));
            //        开始序列化
            objectOutputStream.writeObject(student); //java.io.NotSerializableException 该对象不支持序列化 必须实现接口 Serializable

//            刷新 因为是输出类
            objectOutputStream.flush();
//            关闭
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package ObjectOutputSteam_test;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ObjectOutputStream_Test02 {
//    一次性 序列化多个对象 将对象放在集合中 如果存储多个对象(多次调用writeObject()方法) 会报错
//
public static void main(String[] args) throws  Exception{
    ObjectOutputStream objectOutputStream= new ObjectOutputStream(new FileOutputStream("Users"));
    List<User> list= new ArrayList<>();
    list.add(new User("sd",12));
    list.add(new User("s3d",12));
    list.add(new User("ssdd",12));
    list.add(new User("sad",12));
//    序列化一个集合
    objectOutputStream.writeObject(list);
    objectOutputStream.flush();
    objectOutputStream.close();


}
}

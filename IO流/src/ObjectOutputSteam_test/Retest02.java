package ObjectOutputSteam_test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class Retest02 {
//    复习
public static void main(String[] args) throws Exception {
//    写 需要序列化的类 必须实现Servialable 接口 才能序列化
    ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("Retest02"));
//    将对象封装为一个list 并且加入比较器 用于排序  treeset貌似不支持序列化
//    TreeSet<User> treeSet =new TreeSet<>((o1, o2) -> o1.getAge()-o2.getAge());
    List<User> treeSet = new ArrayList<>();
  treeSet.add(new User("miska",10));
    treeSet.add(new User("miska",14));
    treeSet.add(new User("miska",12));
    treeSet.add(new User("miska",16));
    treeSet.add(new User("miska",1));

//    将对象序列化
    objectOutputStream.writeObject(treeSet);

//    读
    ObjectInputStream objectInputStream= new ObjectInputStream(new FileInputStream("Retest02"));
//    读取
   Object o= objectInputStream.readObject();
   if(o instanceof  List){
       Iterator<User> it= ((List<User>) o).iterator();
       while (it.hasNext()){
           System.out.println(it.next()); //已经重写了toString
       }
   }

}
}

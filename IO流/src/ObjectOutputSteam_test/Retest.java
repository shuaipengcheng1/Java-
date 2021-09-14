package ObjectOutputSteam_test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Retest {
//    复习

    public static void main(String[] args) throws Exception {
//        创建对象序列流
        ObjectOutputStream objectOutputStream= new ObjectOutputStream(new FileOutputStream("misaka"));
//        创建一个list
        List<User> list= new ArrayList<>();
        list.add(new User("misaka",10));
        list.add(new User("misakas",13));
//将list序列化
        objectOutputStream.writeObject(list);

//        创建对象反序列化流
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("misaka"));
        Object obj = objectInputStream.readObject();
        if(obj instanceof List){
            Iterator<User> it= ((List<User>) obj).iterator();
            while (it.hasNext()){
                System.out.println(it.next()); //已经重写toString

                /*
                * User{name='misaka', age=10}
User{name='misakas', age=13}
                * */
            }
        }

    }

}

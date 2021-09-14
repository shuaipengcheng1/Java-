package ObjectOutputSteam_test;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Iterator;
import java.util.List;



public class ObjectInputStream_Test02 {
//    反序列化
public static void main(String[] args) throws Exception {
    ObjectInputStream objectInputStream= new ObjectInputStream(new FileInputStream("Users"));
  Object o=  objectInputStream.readObject();
  if(o instanceof List){
      Iterator<User> iterator = ((List<User>) o).iterator();
      while (iterator.hasNext()){

              System.out.println(iterator.next()); //User对象 已经重写过toString

              /*
              * User{name='sd', age=12}
User{name='s3d', age=12}
User{name='ssdd', age=12}
User{name='sad', age=12}
              *
              * */
          }
      }

  }
}


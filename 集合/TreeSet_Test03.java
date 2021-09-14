package 集合;

import java.util.Set;
import java.util.TreeSet;

public class TreeSet_Test03 {
//    是否能对 自定义class 进行排序呢
//    如果没有指定比较规则 则无法排序 并且报错  ClassCastException
//   如果要进行比较的自定义类 需要 实现 Comparable 接口

public static void main(String[] args) {
//    需求 对Users类 按年龄大小排序
Users users = new Users(10);
Users users1 =new Users(20);
Users users2 =new Users(90);
Users users3 =new Users(30);
Users users4 =new Users(70);

    TreeSet<Users> set = new TreeSet();
    set.add(users);
    set.add(users1);
    set.add(users2);
    set.add(users3);
    set.add(users4);

    for (Users item:set
         ) {
        System.out.println(item);
    }

}

}

class  Users {
    public Users(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Users{" +
                "age=" + age +
                '}';
    }

    int age;

}

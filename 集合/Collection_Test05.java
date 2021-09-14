package 集合;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public class Collection_Test05 {
    public static void main(String[] args) {
        Collection c =new ArrayList();
        User u1 = new User("jack");
        User u2 = new User("jack");
//        加入集合
        c.add(u1);
        System.out.println(c.contains(u2)); //false 因为没有重写equals 重写后 就是true
    }
}
class User{
    private String name;
    public User(){

    }
    public  User(String name){
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
//        判断两个对象的name属性 可以使用equals 因为字符串的equals方法已经重写了
        return Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

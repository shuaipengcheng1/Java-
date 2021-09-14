package 集合;

import java.util.HashSet;
import java.util.Set;

public class Hash_equals {
    public static void main(String[] args) {
        Student student = new Student("张三");
        Student student1 = new Student("张三");
      System.out.println(  student.equals(student1) );//false 还未重写 重写后 true
System.out.println(student.hashCode()); //23934342重写前   重写后774920
        System.out.println(student1.hashCode());  //22307196重写前 重写后774920

//        重写hashcode 后 可以用来判断
//        equals返回true hashcode返回的值也是一样
//        可以使用idea工具生成
        if(student.hashCode()==student1.hashCode()){
            System.out.println("相等");
        }
        Set<Student> set  =new HashSet<>();
        set.add(student);
        set.add(student1);
        System.out.println(set.size()); //1 因为哈希值相同 意思就是在同一个位置上的链表
    }
}

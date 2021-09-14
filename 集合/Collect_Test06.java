package 集合;

import java.util.ArrayList;
import java.util.Collection;

public class Collect_Test06 {

//    remove方法
public static void main(String[] args) {
    Collection c =new ArrayList();
    String s1 = new String("hello");
    c.add(s1);
    String s2 = new String("hello");
    c.add(s2);
    c.remove("hello");
    System.out.println(c.size()); //1
}
}

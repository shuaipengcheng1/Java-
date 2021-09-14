package 集合;

import java.util.HashSet;
import java.util.Set;

public class HashSet_Test01 {
//    HashSet 无序 不可以重复
//    演示
public static void main(String[] args) {
    Set<Integer> set =new HashSet<>();
    set.add(10);
    set.add(10);

    set.add(20);
    set.add(30);
    set.add(40);
    set.add(50);
    for (Integer item:set
         ) {
        System.out.println(item);
        /* 无序 并且不可重复
        * 50
          20
          40
          10
          30
        * */
    }
}
}

package 集合;

import java.util.Set;
import java.util.TreeSet;

public class TreeSet_Test01 {
//    TreeSet 无序 不可重复 但是存储的数据可以按照大小自动排序 因为实现了SortSet类
//    可排序集合
public static void main(String[] args) {
    Set<Integer> set = new TreeSet();
    set.add(10);
    set.add(60);
    set.add(30);
    set.add(50);
    for (Integer item : set
         ) {
        System.out.println(item);
    }
    /*
    * 10
      30
      50
      60
    *
    * */

}
}

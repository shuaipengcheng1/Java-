package 集合;

import java.util.Set;
import java.util.TreeSet;

public class TreeSet_Test02 {
//    TreeSet集合 底层是一个TreeMap集合
//    都是二叉树
//    放在TresSet中的元素 默认放在 TreeMap的Key中
//    TreeSet的元素 无序 且不可重复 但是可以按照大小进行顺序排序
//    称为可排序集合

    public static void main(String[] args) {
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("1");
        treeSet.add("4");
        treeSet.add("2");
        treeSet.add("60");

//        循环
        for (String item:treeSet
             ) {
            System.out.println(item);
            /*
            * 1
              2
              4
              60
            * */
        }
    }
}

package 集合;

import java.util.*;

public class TreeMap_ReTest {
//    复习 TreeMap的key 或者 TreeSet的值(因为TreeSet底层起始就是将值存入了TreeMap的key中) 会自动通过自平衡二叉树排序 中序循环
//    自定义类的排序 要实现Comparable接口 或者使用比较器

    public static void main(String[] args) {
//        创建一个TreeSet 使用比较器方法(匿名内部类)
        TreeSet<TreeSet_Test> treeSet  =new TreeSet<>(new Comparator<TreeSet_Test>() {
            @Override
            public int compare(TreeSet_Test o1, TreeSet_Test o2) {
                return o1.age-o2.age;
            }
        });
        treeSet .add(new TreeSet_Test(10));
        treeSet .add(new TreeSet_Test(60));
        treeSet .add(new TreeSet_Test(50));
        treeSet .add(new TreeSet_Test(120));
        treeSet .add(new TreeSet_Test(70));
//        循环
        for (TreeSet_Test item:treeSet
             ) {
            System.out.println(item);
            /*
            * TreeSet_Test{age=10}
              TreeSet_Test{age=50}
              TreeSet_Test{age=60}
              TreeSet_Test{age=70}
              TreeSet_Test{age=120}

            * */
        }

//        创建一个TreeMap 通过接口
        TreeMap<TreeMap_Test,Integer> treeMap = new TreeMap();

        treeMap.put(new TreeMap_Test(10),1);
        treeMap.put(new TreeMap_Test(40),1);
        treeMap.put(new TreeMap_Test(70),1);
        treeMap.put(new TreeMap_Test(320),1);
        treeMap.put(new TreeMap_Test(1312),1);
        treeMap.put(new TreeMap_Test(50),1);
        treeMap.put(new TreeMap_Test(80),1);
//循环
        Set<Map.Entry<TreeMap_Test,Integer>> set = treeMap.entrySet();
//        循环
        for (Map.Entry<TreeMap_Test,Integer> item: set
             ) {
            System.out.println(item); //该类 重写了toString了的
//     按照比对规则排序
//TreeMap_Test{age=10}=1
//TreeMap_Test{age=40}=1
//TreeMap_Test{age=50}=1
//TreeMap_Test{age=70}=1
//TreeMap_Test{age=80}=1
//TreeMap_Test{age=320}=1
//TreeMap_Test{age=1312}=1
        }
    }

}
class TreeSet_Test{
    public TreeSet_Test(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "TreeSet_Test{" +
                "age=" + age +
                '}';
    }

    int age;

}
//实现接口
class TreeMap_Test implements  Comparable<TreeMap_Test>{
    public TreeMap_Test(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "TreeMap_Test{" +
                "age=" + age +
                '}';
    }

    @Override
    public int compareTo(TreeMap_Test o) {
        return this.age-o.age;
    }

    int age;
}

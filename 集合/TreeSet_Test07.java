package 集合;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet_Test07 {
    public static void main(String[] args) {
//      对自定义类的排序的第一种方法
//        TreeSet<Test> treeSet= new TreeSet();
//        treeSet.add(new Test(10));
//        treeSet.add(new Test(40));
//        treeSet.add(new Test(20));
//        treeSet.add(new Test(30));
//        for (Test item:treeSet
//             ) {
//            System.out.println(item);
//        }
//
//    }

//        第二种 使用比较器 匿名内部类
        TreeSet<Test> treeSet = new TreeSet(new Comparator<Test>() {
            @Override
            public int compare(Test o1, Test o2) {
                return o1.age - o2.age;
            }
        });
        treeSet.add(new Test(10));
        treeSet.add(new Test(40));
        treeSet.add(new Test(20));
        treeSet.add(new Test(30));
        for (Test item:treeSet
             ) {
            System.out.println(item);
        }
    }


}

class Test {
    //    根据年龄排序
    int age;

    @Override
    public String toString() {
        return "Test{" +
                "age=" + age +
                '}';
    }

    public Test(int age) {
        this.age = age;
    }


}
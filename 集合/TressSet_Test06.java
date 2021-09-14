package 集合;

import java.util.Comparator;
import java.util.TreeSet;

public class TressSet_Test06 {
//    第一种是 实现Comparable接口 重写compareTo(T o)方法
//    TreeSet 集合 元素排序的第二种方法 使用比较器方式(使用一个单独的类 实现Comparator接口 重写Compare()方法)

//    如果比较规则不会发生改变 使用Comparable
//    如果要经常改变 使用Comparator 因为比较器可以写多个
    public static void main(String[] args) {

//         使用比较器 要在TreeSet集合构建时 传入在形参中
//        TreeSet<Wugui> treeSet =new TreeSet(new WuGui_Comparator());



//        第二种使用的方法 使用匿名内部类 直接new接口<>(){}
        TreeSet<Wugui> treeSet1 = new TreeSet<>(new Comparator<Wugui>() {
            @Override
            public int compare(Wugui o1, Wugui o2) {
             return o1.age-o2.age;
            }
        });
        treeSet1.add(new Wugui(10));
        treeSet1.add(new Wugui(30));
        treeSet1.add(new Wugui(50));
        treeSet1.add(new Wugui(20));
        for (Wugui item: treeSet1
             ) {
            System.out.println(item);
            /*
            * 小乌龟{年龄=10}
              小乌龟{年龄=20}
              小乌龟{年龄=30}
              小乌龟{年龄=50}
            * */
        }

    }
}
class Wugui{
    @Override
    public String toString() {
        return "小乌龟{" +
                "年龄=" + age +
                '}';
    }

    int age;
    public  Wugui(int age){
        this.age=age;
    }
}


//单独写一个比较器 比较器 单独实现 Comparator接口
//class WuGui_Comparator implements Comparator<Wugui> {
//    @Override
//    public int compare(Wugui w1 ,Wugui w2) {
////        比较年龄规则
//
////        如果w1 比w2 大 则返回值>0
////        如果w1 比w2 小 则返回值<0
////        如果w1与w2相等 返回0
//        return  w1.age-w2.age;
//    }
//}


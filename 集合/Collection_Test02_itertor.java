package 集合;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class Collection_Test02_itertor {
//  关于 迭代器

    public static void main(String[] args) {
//        以下的遍历方式/迭代方式 是所有Collection(List , Set)通用的一种方式
//        在Map集合中不能使用

//        创建集合对象
        Collection c = new HashSet();  //底层为HashMap()
        c.add(100);
        c.add("def");
        c.add("misaka");
//        对集合的元素 进行迭代
//        1 获取需要迭代的集合的迭代器对象(Iterator) 通过调用iterator()方法获取
        Iterator i = c.iterator();
//        2 通过迭代器对象 来遍历集合
        /* 迭代器的方法
         * 1  boolean hasNext() 是否有元素可以迭代 返回布尔值
         * 2 Object next() 返回迭代的下一个元素
         * 3 void remove() 从迭代器指向的collection中 移出迭代器返回的最后一个元素(可选操作)
         * */

//        猜想使用 对罗
//        for (int j = 0; j < c.size(); j++) {
//            if (i.hasNext()) {
////                取出的值 都是Object类型 并且自动调用toString()
//                System.out.println(i.next());
//                /*
//                *
//                * 100
//                  def
//                  misaka
//                * */
//            }
//        }

//        第二种
        while (i.hasNext()){
            Object obj = i.next();
            System.out.println(obj);
        }

    }

}

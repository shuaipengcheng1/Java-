package 集合;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class 复习01 {
    public static void main(String[] args) {
//        创建一个Collection集合
        Collection cl = new ArrayList();
//        添加元素
        cl.add("a");
        cl.add(10);
//        删除元素
        cl.remove("a");
//        查看集合大小
        System.out.println(cl.size());
//        查看集合中是否包含10
        System.out.println(cl.contains(10));
//        清空集合
        cl.clear();
//        添加集合
        cl.add(30);
        cl.add(40);
        cl.add(50);
        cl.add("2");
//        获取迭代器
        Iterator it =cl.iterator();
//        迭代
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}

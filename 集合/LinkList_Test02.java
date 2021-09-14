package 集合;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
/*
* 链表增删效率高
* 内存不连续
* */
public class LinkList_Test02 {
    public static void main(String[] args) {
        List list = new LinkedList();
        list.add(10);
        list.add(20);

//        linklist没有初始话容量
//        最初时 first last 都是null
//        以后写代码不用关心这些

        for (int i = 0; i <list.size() ; i++) {

//            因为LinkList也属于 list家族 有序 有下标
            System.out.println(list.get(i));
        }
//        迭代器
        Iterator it = list .iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}

package 集合;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List_Test01 {
//    List接口的方法
//    List特点 : 有序 可重复 有下标

//    List是Collection的子接口 所以有所有Collection的方法

//    List常用方法
    /*
    * void add(int index,Object element)
    * Object get(int index)
    * int indexof(Object o)
    * int lastindexof(object o)
    * Object remove(int index)
    * Object set(int index , E element)
    * */
public static void main(String[] args) {
//    创建一个List集合
    List l = new ArrayList();
    l.add("a");
    l.add("b"); //向集合末尾添加元素
    l.add(1,"misaka"); //在下标为1的地方插入 misaka
    Iterator i = l.iterator();
    while (i.hasNext()){
        System.out.println(i.next());
    }
//    通过小标获取元素
    Object obj = l.get(2); //b
    System.out.println(obj);

//    通过下标遍历 而不用迭代器
    for (int j = 0; j <l.size() ; j++) {
        System.out.println(l.get(j)); //通过下标获取元素
    }
//获取一个元素第一次出现时的索引
    System.out.println(l.indexOf("misaka")); //1
//    获取一个元素最后一次出现的索引
    System.out.println(l.lastIndexOf("a")); //0
//删除指定下标的元素
    l.remove(0); //删除指定位置
    System.out.println(l.size()); //2

//    修改指定位置的值
    l.set(1,"sort"); //将下标为1 的元素值 改为sort
    for (int j = 0; j <l.size() ; j++) {
        System.out.println(l.get(j));
    }
}
}

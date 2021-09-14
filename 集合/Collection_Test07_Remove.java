package 集合;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Collection_Test07_Remove {
    public static void main(String[] args) {
//        创建集合对象
        Collection c = new ArrayList();
        c.add(1);
        c.add(2);
        Iterator i = c.iterator();
//        c.add(2);  报错 ConcurrentModificationException 当获取对应集合的迭代器后 就不能在修改集合 只能重新获取迭代器 否则将会报错
        while (i.hasNext()){
//            c.remove(i.next()); 在迭代器中 也不能修改集合的结构
//            但是使用迭代器去删除 就可以 因为迭代器的原理就是保存一个对应集合的副本 通过副本来修改集合对象的值 如果通过 集合对象.remove()
//            直接删除 就会发生副本与集合对象不一样所以报错 所以要通过迭代器删除 通过删除副本的元素 底层再去删除对应集合的元素

//            迭代器.remove() 该函数删除的是当前迭代器指向的元素 并且自动更新迭代器副本 并且更新集合对象与副本一致
            System.out.println(i.next());
            i.remove();


        }
        System.out.println(c.size());//0 因为已经在迭代器中删除了所有的元素
    }
}

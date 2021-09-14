package 集合;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class 哈希表数据结构 {
    public static void main(String[] args) {
//        哈希表

        /*    -------哈希表数据结构
        * 数组和单向链表的结合体
        * 数组 : 查询时效率高 随机增删效率低
        * 链表 : 随机增删高 查询低
        * 哈希表 就是将两个融合在一起
        *
        *哈希表/散列表 一维数组 这个数组中的每一个元素是一个单向链表(所以他是数组和链表的结合体)、
        * ------------jdk8 新特性
        * 如果数组中的单向链表长度(size)>8 底层会自动转为红黑树 <6时 又转为单向链表
        *
        * —————— 当两个Node对象的Key的 hash值相同 那么一定 在同一条链表上面 (同一个数组下标)
        * */

        /*  ----------HashMap
        * HashMap 底层是哈希表数据结构/散列表
        *HashMap 底层其实是一个数组 (一维数组) 数组中存放的是他的静态内部类HashMap.Node
        * HashMap.Node中有几个比较重要的属性{
        * final int hash; //哈希值 (该值是key的hashCode()的执行结果,hash值通过哈希算法就可以转为数组的下标)
        * final K key;  //存储在Map集合中的key
        * V value //存储在map集合中的value
        * Node<K,V> next; // 下一个节点(HashMap.Node)的内存地址
        *
        * }
        *
        *重点掌握 如何存入 如何取出的原理
        * map.put(K,V);
        * V map.get(K);
        *
        * --------关于HashMap的扩容
        * HashMap的数组的默认长度是 16 加载因子是0。75
        * 当数组的容量到达75%时 数组自动扩容
        *
        * -------终极结论
        *  放在HashMap key部分的 和 放在 HashSet(HashSet的元素在底层中会作为HashMap的key)集合中的元素 需要同时重写hashcode 和equals方法
        * */
        Map<Integer,String> map = new HashMap<>();

//        检测
        map.put(2,"misaka");
        map.put(1,"20");
//        按原理来说 50会覆盖20
        map.put(1,"50");
        System.out.println(map.get(1)); //50

//        遍历
        Set<Map.Entry<Integer,String>> Loop=map.entrySet();
        System.out.println(Loop.size());
        Iterator<Map.Entry<Integer,String>> it =Loop.iterator();
    while (it.hasNext()){
Map.Entry<Integer,String> item = it.next();
//  Integer key =it.next().getKey();
//  String value = it.next().getValue();
  System.out.println(item.getValue());


//  System.out.println(value);
    }


        for (Map.Entry<Integer,String > item:Loop
             ) {
//            无序 不可以重复
            System.out.println(item);
            /*
            * 1=50
              2=misaka

            * */
        }
    }
}

package 集合;

import java.util.*;

public class Map_Test01 {
    //    Map接口常用方法
    public static void main(String[] args) {
        /*
         * Map 与 Collection 没有继承关系 意思就是没有迭代器 和 Collection上的方法
         * Map集合 以Key value 的方法 存值 键值对
         *       key value 都是 引用数据类型
         *
         *
         * --------------Map的泛型
         * Map<K,V>  K为Key的类型 V为Value的类型
         *
         *
         *------------方法
         * void clear()  清空
         *Boolean containValue()     Map 中 是否包含指定value
         * Boolean containKey()      Map 中 是否 包含指定key
         * V get(Object K)           通过key 获取value
         * Boolean isEmpty()         判断map是否为空
         * Set<V> KeySet()           获取map集合的所有的key
         * V put(K key, V value)     添加键值对
         * void remove(Objetc key)   根据key来删除
         * int size()                返回Map中键值对的个数
         * Collection<V> values()    返回所有的Value
         * Set<Map.Entry<K,V>> entrySet() 将map集合转为Set集合 Set set  = Map.entry()   【注意 这样转换的Set集合 集合元素类型为Map.Entry<K,V> {Entry是Map的静态内部类}】
         *
         * */


//    Map在声明时 必须使用泛型声明 Key value的类型
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "hello");  //这里的1 是 Integer 因为自动装箱了
        map.put(2, "张三");
        String re = map.get(1); //根据key 获取Value
        System.out.println(re);//hello
//        根据Key删除
        map.remove(1);
        System.out.println(map.size());//1
//map底层比对 都是使用的equals 所以 自定义的类 要重写equals方法
        System.out.println(map.containsKey(2)); //true
        System.out.println(map.containsValue("张三")); //true

//        获取所有的value 并且存入在一个Collection集合中
        Collection<String> collection = map.values();
        for (String item : collection
        ) {
            System.out.println(item); //张三
        }
        Set<Integer> set1 = new TreeSet();
//        获取所有的key 并且存在一个Set集合中 (TreeSet 集合 可以自动大小排序)
        set1 = map.keySet();
        for (Integer item : set1
        ) {
            System.out.println(item);
        }

    }
}

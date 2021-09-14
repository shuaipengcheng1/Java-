package 集合;

import java.util.*;

public class Map_Test02 {
    //        Map集合遍历
    public static void main(String[] args) {
//        1 获取所有的key 通过get方法 来 遍历 map集合
        Map<Integer,String> map = new HashMap();
        Set<Integer>  set=new HashSet();

//        添加元素
        map.put(1,"小王");
        map.put(2,"张三");
        map.put(3,"王五");

//        获取所有的key 并且存储在set集合中·
        set= map.keySet();
//        遍历
        for (Integer item: set
             ) {
            System.out.println(item+" : "+map.get(item));
            /*
            * 小王
              张三
              王五
*/
        }
        //            第二种 Set<Map.Entry<K,V>> = map.entrySet();
//            这一种 是将 整个Map集合(key 与 value) 转为Set集合
//        这里的<Map.Entry> 是一个Map的静态内部类
//        语法 Set<Map.Entry<要接受的Key的类型,要接受的value的类型>>
        Set<Map.Entry<Integer,String>> set1 = new TreeSet();
        set1 = map.entrySet();
//        通过迭代器 获取
        Iterator<Map.Entry<Integer,String>> it =set1.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
            /*
            * 1=小王
              2=张三
              3=王五
            * */
//            还可以获取key
//      Map.Entry<Integer,String> node=it.next();
//  Integer key=   node.getKey();
//  String value = node.getValue();
//  System.out.println(key+" : "+value);
        }



//        foreach
        for (Map.Entry< Integer,String > item: set1
             ) {
            System.out.println(item.getKey());
            System.out.println(item.getValue());

        }
    }
}

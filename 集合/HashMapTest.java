package 集合;

import java.util.Iterator;
import java.util.Map;

import java.util.HashMap;
import java.util.Set;

public class HashMapTest {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "misaka");
        map.put(2, "xsx");
        map.put(2, "xx"); //key重复  value会覆盖
        System.out.println(map.size());//2

//        取key为2 的元素
        System.out.println(map.get(2)); //xx
//        遍历map
//        1 通过下标
        Set<Integer> set = map.keySet();
        for (Integer item : set
        ) {
            System.out.println(map.get(item));
        }

//        2 通过map.entrySet()
        Set<Map.Entry<Integer, String>> set1 = map.entrySet();
//        foreach
        for (Map.Entry<Integer, String> item : set1
        ) {
            System.out.println(item); //Map.Entry该类重写了toString
//            也可以单独获取 key or value
            System.out.println(item.getValue());
            System.out.println(item.getKey());

            /*
            * 1=misaka
              2=xx
            * */
        }
//        迭代器
        Iterator<Map.Entry<Integer, String>> it = set1.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());//Map.Entry该类重写了toString
            //            也可以单独获取 key or value
            Map.Entry<Integer, String> obj = it.next();
            System.out.println(obj.getValue());
            System.out.println(obj.getKey());
        }

    }

}

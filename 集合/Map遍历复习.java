package 集合;
import java.util.Map;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class Map遍历复习 {
    public static void main(String[] args) {
//        1 通过key
        Map<Integer, String> map=new HashMap<>();
        Set<Integer> set= new TreeSet<>();
//        存储值
        map.put(1,"hello");
        map.put(2,"world");

//        获取所有的key
        set=map.keySet();
        for (Integer item: set
             ) {
            System.out.println(item+" : "+map.get(item));
        }

//        2通过Map.entrySet()方法
        Set<Map.Entry<Integer,String>> set1 = map.entrySet();

//        foreach
        for (Map.Entry<Integer,String> item: set1
             ) {
            System.out.println(item.getKey()+" : "+item.getValue());
        }


    }
}

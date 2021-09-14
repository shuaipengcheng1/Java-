package 集合;


import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;



//HashMap key和value都允许是null  非线程安全

//hashtable 不允许key和value为null  线程安全 初始量11 加载因子是0.75 扩展为2倍原大小 加一

public class HashMap和HashTable的区别 {
    public static void main(String[] args) {


        Map map = new HashMap();
        map.put(null,null);
        System.out.println(map.size()); //1 说明可以存储null值
        map.put(null,499);
//        通过key 获取value
        Object object= map.get(null);
        System.out.println(object);
        System.out.println(map.size()); //1 key重复 value会覆盖
        Set<Map.Entry<Object,Object>> set = map.entrySet();


        for (Map.Entry<Object,Object> item: set
             ) {
            System.out.println(item.getKey());
            System.out.println(item.getValue());

        }


        Map<Object,Object> map1 = new Hashtable();
        map1.put(null,"x");
       Object obj = map1.get(null);
       System.out.println(obj); //报错 空指针异常

    }
}

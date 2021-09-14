package 集合;

import java.util.*;

public class TreeMapTest {
    public static void main(String[] args) {
        Map<Test_Hash,Integer> map =new TreeMap<>();

//        添加 map集合 都会对key部份 值 进行排序 如果是自定义类 则要写在类中继承Comparable接口并且实现方法 或者在new Hash时传入比较器(一般使用匿名内部类)

        map.put(new Test_Hash(20),3);
        map.put(new Test_Hash(30),3);
        map.put(new Test_Hash(10),3);
        map.put(new Test_Hash(70),3);
        map.put(new Test_Hash(90),3);

//        循环 使用 entry()
        Set<Map.Entry<Test_Hash,Integer>> set= map.entrySet();

//        foreach
        for (Map.Entry<Test_Hash,Integer> item: set
             ) {
         System.out.println(item);
        }
//使用迭代器
        Iterator<Map.Entry<Test_Hash,Integer>> it = set .iterator();
        while (it.hasNext()){
            System.out.println(it.next().getKey());
        }

    }
}

class Test_Hash implements Comparable<Test_Hash>{
    public Test_Hash(int age) {
        this.age = age;
    }

    int age;

    @Override
    public String toString() {
        return "Test_Hash{" +
                "age=" + age +
                '}';
    }

    @Override
    public int compareTo(Test_Hash o) {
        return this.age-o.age;
    }
}

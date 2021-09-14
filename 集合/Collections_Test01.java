package 集合;

import java.util.*;


//Collection 集合接口
//Collections 集合工具类 方便集合的操作
public class Collections_Test01 {
    public static void main(String[] args) {
        List<String> list= new ArrayList<>();
//        变为线程安全的集合
        Collections.synchronizedList(list);

        list.add("10");
        list.add("90");
        list.add("45");
//        对List集合排序
        Collections.sort(list);

//        foreach循环 又可以循环map 还可以循环 Collection 不像迭代器 只能循环Collection
        for (String item:list
             ) {
            System.out.println(item);
            /*
            * 10
              45
              90
            * */

        }

//        对自定义类排序
        List<Wugu> list1 = new ArrayList<>();
        list1.add(new Wugu(10));
        list1.add(new Wugu(30));
        list1.add(new Wugu(40));
        list1.add(new Wugu(60));
//        Collections.sort(list1); //如果 自定义类不重写比较器Comparable接口的CompareTo方法 就会报错
        Collections.sort(list1);
        for (Wugu item: list1
             ) {
            System.out.println(item);
        }

//        对Set集合排序
        Set<String> set = new HashSet<>();
        set.add("10");
        set.add("50");
        set.add("70");
        set.add("40");
//        将set集合转为List 传入List构造函数的参数中
        List<String> list2 = new ArrayList<>(set);
//        然后可以进行排序了
        Collections.sort(list2);



    }
}
class Wugu implements Comparable<Wugu>{
    public Wugu(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Wugu o) {
        return this.age-o.age;
    }

    @Override
    public String toString() {
        return "Wugu{" +
                "age=" + age +
                '}';
    }

    int age;

}
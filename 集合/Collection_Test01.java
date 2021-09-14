package 集合;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
//1 Collection 中 可以存储什么?
// 1 没有使用泛型<> 可以存储object的所有子类型
//2 使用了泛型 只能存储 指定的类型

public class Collection_Test01 {
    public static void main(String[] args) {
//创建一个集合对象
//        Collection collection = new Collection(); 接口是无法实例化的
//        使用内部的实现类 ArrayList() 多态 父类型的引用 指向一个子类型对象
        Collection collection = new ArrayList();


//      1  测试Collection的方法 void add(Object obj) 向集合中 添加元素
        collection.add(200);  //自动装箱 自动将200 转为 Integer.valueof(200) (将基本数据类型 转为引用数据类型 因为集合不能存储基本数据类型)
        collection.add(3.14);
        collection.add(true);  //依然是自动装修 Boolean.valueof(true)

//      2 测试Collection的方法  int size() 返回集合中元素的个数
        System.out.println(collection.size()); //3

//      3 void clear() 清空集合
        collection.clear();
        System.out.println(collection.size());  //0

//        在继续添加元素
        collection.add("hello world"); //这里集合是存储的字符串的内存地址

//        Boolean contain(Object obj) 判断该集合中是否包含对象obj 返回布尔值
        System.out.println(collection.contains("hello world")); //true  在底层比较 应该用到了equals()

//        void remove(object obj) 删除集合中的一个对象
        collection.remove("hello world");
        System.out.println(collection.size());//0

//        Boolean isEmpty() 判断一个集合是否为空(size是否为0) 返会 布尔型
        System.out.println(collection.isEmpty()); //true


//        Object[] toArray()  将集合转为一个数组
        collection.add("hello world");
        System.out.println(collection.toArray()[0]); //hello world

//        boolean addAll(Collection c) 将另一个集合值 传入到当前集合中
        Collection c = new ArrayList();
        c.add(100);
        c.add(200);
        collection.addAll(c);
//创建迭代器
        Iterator i = collection.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}

package 集合;

import java.util.List;

public class Vector {
    public static void main(String[] args) {
//        该容器 扩容原容量的2倍  而ArrayList 扩容是1.5倍(位右移1位)
//        并且 该容器线程安全
        List vector = new java.util.Vector();
        vector.add(10);
        vector.add(10);
        vector.add(10);
        vector.add(10);
        vector.add(10);
        vector.add(10);
//        迭代器使用一样 ....


    }
}

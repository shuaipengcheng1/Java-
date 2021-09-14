package 集合;

import java.util.Set;
import java.util.TreeSet;

/*
* CompareTo的返回值很重要
* 返回0 value会覆盖 也就是多个相同时 只有一个 除非改为 x相同时 再去比较 y
* 返回>0 会在右子树上面找
* 返回<0 会在左子树上面找
* */

public class TreeSet_Test05 {
    public static void main(String[] args) {
        Set<V> set = new TreeSet<>();
        set.add(new V(10, "a"));
        set.add(new V(10, "f"));
        set.add(new V(10, "d"));


        set.add(new V(30));
        set.add(new V(50));
        set.add(new V(40));
        set.add(new V(20));
        for (V item : set
        ) {
            System.out.println(item);
        }

    }
}

class V implements Comparable {
    public V(int age) {
        this.age = age;
    }

    public V() {
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof V) {
            V v = (V) o;
//            保存要比较的值
            int age1 = this.age;
            int age2 = v.age;
//            比较
            if (age1 == age2) {
//            年龄相同时按照名字大小比较 String不需要重写compareTo 底层已经实现了
                return this.name.compareTo(v.name);
//                return 0;
            } else if (age1 > age2) { //想要降序 this>xx 时 返回 1
                return 1;
            } else {
                return -1;
            }
        }
        return 0;
    }

    @Override
    public String toString() {
        return "V{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    int age;

    public V(int age, String name) {
        this.age = age;
        this.name = name;
    }

    String name;
}

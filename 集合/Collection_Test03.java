package 集合;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class Collection_Test03 {
    public static void main(String[] args) {
        Collection c1 = new ArrayList();
//        ArrayList() 特点是 可重复 有序
        c1.add(100);
        c1.add(200);
        c1.add(100);
        Iterator i1 = c1.iterator();
        while (i1.hasNext()) {
            System.out.println(i1.next()); //100 200 100
        }
        Collection c2 = new HashSet();
//      HashSet 原型是 hashMap 特点是无序 不可重复
        c2.add(321);
        c2.add(332);
        c2.add(231);
        c2.add(13);
        c2.add(21);

        c2.add(200);
        c2.add(300);
        c2.add(200);
        Iterator i2 = c2.iterator();
        while (i2.hasNext()) {
            System.out.println(i2.next()); //321 21 231 200 332 300 13 顺序不同 并且无重复
        }
    }
}

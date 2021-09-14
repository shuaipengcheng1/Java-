package 集合;

import java.util.*;

public class ArrayList_Test02 {
    public static void main(String[] args) {
        List myList1 = new ArrayList();

        List myList2 = new ArrayList(100);

//        创建一个HashSet
        Collection collection = new HashSet();
        collection.add(100);
        collection.add(200);
//        传入一个集合 将hashset集合 转为一个ArrayList集合
        List myList3 = new ArrayList(collection);

//        遍历
        for (int i = 0; i <myList3.size() ; i++) {
            System.out.println(myList3.get(i));
        }
//        通过迭代器
        Iterator it=  myList3.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}

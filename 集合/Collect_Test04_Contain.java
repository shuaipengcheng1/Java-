package 集合;

import java.util.ArrayList;
import java.util.Collection;

public class Collect_Test04_Contain {
//    深入Contains方法
//    boolean contain(Object obj) 判断一个集合中 是否包含指定对象 返回 布尔型
public static void main(String[] args) {
//    创建集合对象
    Collection collection= new ArrayList();
    collection.add("abc");
    collection.add("def");
    System.out.println(collection.contains("abc")); //这里在底层中 不是比较的内存地址 而是通过equals判断的 所以为true
}

}

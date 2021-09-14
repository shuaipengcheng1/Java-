package 集合;

import java.util.ArrayList;
import java.util.List;

public class Foreach_Test01 {
    public static void main(String[] args) {
//        Jdk5.0 新特性 增强for 循环 foreach()
        int[] arr  = {10,20,30,40};
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]); //普通for循环
        }

//        增强for循环 很像js的for..in..

//        for(类型 变量名: 数组或集合) 没有下标哦
        for (int item : arr){
            System.out.println(item);
        }
        List list= new ArrayList();
        list.add("hello");
        list.add("world");
        for (Object item:list
             ) {
            System.out.println(item);
        }
    }
}

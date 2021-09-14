package 数组;

import java.util.Arrays;

public class 数组工具类 {
//    java 提供的关于操作数组的类 Arrays
//    方法都为静态方法 所以可以直接调用
public static void main(String[] args) {
    int[] arr = {2,3,5435,5646,534};
//    排序 sort方法 会修改原本的数组
    Arrays.sort(arr);
    for (int i = 0; i <arr.length ; i++) {
        System.out.println(arr[i]);
    }
//    java提供了很多的

}
}

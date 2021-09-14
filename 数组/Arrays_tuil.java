package 数组;

import java.util.Arrays;

public class Arrays_tuil {
//    数组工具类的详细使用
//   可以参考Api文档
public static void main(String[] args) {
    int[] arr = {50,20,30,432};
    Arrays.sort(arr);
    for (int i = 0; i <arr.length ; i++) {
        System.out.println(arr[i]);
    }
   二分法.Er_fen(arr,20,0);
}
}

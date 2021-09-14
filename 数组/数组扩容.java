package 数组;

public class 数组扩容 {
//    java中数组扩容 就是将小数组 的值  传入一个大数组当中
public static void main(String[] args) {
    int[] arr1 = {1,2,3};
    int[] arr2 =new int[10];
//    扩容
    for (int i = 0; i <arr1.length ; i++) {
     arr2[i]=arr1[i];
     System.out.println(arr2[i]);
    }
}
}

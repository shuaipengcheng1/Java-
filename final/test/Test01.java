package test;

import java.util.Arrays;
import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {

    Scanner ss = new Scanner(System.in);
        String s = ss.next();  //ismka
    System.out.println(s.length()); //字符串长度
        String[] arr = s.split("m"); //字符串根据关键子切割 返回的是字符串数组
        String re  = s.replace("m","i"); //字符串替换
        System.out.println(arr[1]); //["is","ka"] //根据m左右分割
        System.out.println(re);

       int[] a = new int[3]; //创建一个int类型的数组 并且长度为三
for(int i=0;i<a.length;i++){
    a[i] = 10;
}
        for(int i=0;i<a.length;i++){
         System.out.println(a[i]);
        }

    }
//    该类不能被继承
    public final  class Pet{

    }
//    class Dog  extends  Pet 报错 因为Pet类是一个final类

}

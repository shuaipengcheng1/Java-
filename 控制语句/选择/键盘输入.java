package 选择;

import java.util.Scanner;

public class 键盘输入 {
    public static void main(String[] args) {
//        需要实例化一个对象 键盘扫描器
//        java.util.Scanner s = new java.util.Scanner(System.in);
//        简写 与js一样 对象寻找属性是通过原型链查找的
        Scanner s =new Scanner(System.in);
//        使用实例化对象的next方法 并且会将输入值 变为字符串返回
//        String re=s.next();
//        输出文本
//        System.out.println(re);

//        使用实例化对象的nextInt() 方法接int类型值
        int re = s.nextInt();
        System.out.println(100.0+re);

    }
}

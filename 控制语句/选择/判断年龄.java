package 选择;

import java.util.Scanner;

public class 判断年龄 {
    public static void main(String[] args) {
//        创建实例化对象
        Scanner s = new Scanner(System.in);
//        接收
       int re=  s.nextInt();
if(re<20){
    System.out.println("未成年");
}
if(re>20&&re<40){
    System.out.println("中年");
}
if(re>40){
    System.out.println("老年");
}
    }
}

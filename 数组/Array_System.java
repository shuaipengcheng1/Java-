package 数组;

import java.util.Scanner;

public class Array_System {
//    模拟一个系统 必须 输入 用户名 和 密码
public static void main(String[] args) {
   if(args.length!=2){
       System.out.println("失败");
   }else {
//       判断输入的值 是否正确 通过equals来判断字符串是否相等
   if("admin".equals(args[0])&&"pass".equals(args[1])){
       System.out.println("成功");
   }else {
       System.out.println("密码or用户名错误");
   }
   }
}
}

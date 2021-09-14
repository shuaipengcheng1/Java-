package java日期;

import java.util.Date;

public class Date_Test2 {
  static   long  begin;
//    获取时间戳
public static void main(String[] args) {
    Date date = new Date();
//    第一中
begin= date.getTime(); //1626412430015
//    第二种
 long ll=   System.currentTimeMillis(); //也是时间戳
    System.out.println(begin);
print();
}
public static void print(){
    Date date = new Date();

    // 统计一个方法总耗费的时长
    for (long i = 0; i <=1000000000 ; i++) {
        if(i==1000000000){
            System.out.println(System.currentTimeMillis()-begin+"毫秒");
        }
    }
}
}

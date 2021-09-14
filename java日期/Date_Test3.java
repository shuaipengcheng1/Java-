package java日期;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_Test3 {
//    构建Date对象使用时间戳构建
public static void main(String[] args) {
//    获取时间戳
    long time = System.currentTimeMillis();
    Date date = new Date(time);//Fri Jul 16 13:28:42 CST 2021
    System.out.println(date);

    SimpleDateFormat sdf =new  SimpleDateFormat("yyyy-MM-dd");
  System.out.println(sdf.format(date));

}
}

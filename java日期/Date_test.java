package java日期;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import  java.util.Date;

public class Date_test {
    public static void main(String[] args) {

//        java的日期处理
      Date date = new Date();
        System.out.println(date.toString()); //Fri Jul 16 12:59:12 CST 2021
//        如果想要一定格式的日期显示 就要使用 下面这一个
//        yyyy 年   MM 月 dd日 HH时
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SS");
//        定义完格式之后 调用该对象的方法String format(Date) 就会创建一个指定格式的时间戳
        System.out.println(sdf.format(date));//2021-07-16 13:04:51:673

//        假设有一个字符串 如何转为Date类型
  String str = "2002-08-24"      ;
  SimpleDateFormat sdf2  = new SimpleDateFormat("yyyy-MM-dd");
//  调用parse方法 并且parse必须使用try{}catch(){}方法包围就像是async一样
        try {
            Date newdate=   sdf2.parse(str);
            System.out.println(newdate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}

package 常用类;

import java.text.DecimalFormat;

public class DecimalFormatTest {
//    关于数字的格式化
public static void main(String[] args) {
//    该构造函数中 传入数字的格式
//    # 任意数字  , 千分位  . 小数点   0 不够时补0                           小数点前面用千分位隔开 小数点保留两位
    DecimalFormat decimalFormatTest = new DecimalFormat("###,###.##");
String num=  decimalFormatTest.format(1234526.66778); //1,234,526.67
System.out.println(num);
//                                                     不满6位数字 自动补0
   DecimalFormat decimalFormat = new DecimalFormat("000000");

System.out.println(decimalFormat.format(1234)); //001234
}
}

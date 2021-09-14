package 常用类;

import java.math.BigDecimal;

public class BigDecimalTest {
//    BigDecimal属于大数据 精度极好 属于引用
//    应用在财务软件中
//    一般用于处理财物数据
public static void main(String[] args) {
    double d = 12345678.9999;
    BigDecimal bigDecimal = new BigDecimal(d);
    System.out.println(bigDecimal);//12345678.99990000016987323760986328125
//    并且如果大数据 要进行求和 则要调用实例化对象的方法add 并会返回一个BigDecimal对象
    BigDecimal bigDecimal1  = new BigDecimal(100);
  BigDecimal  bigDecimal2=  bigDecimal.add(bigDecimal1);
  System.out.println(bigDecimal2);

}
}

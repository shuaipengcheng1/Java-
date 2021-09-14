package 常用类;
//关于 java.lang.String
//   1 String 表示字符串类型 是一种引用数据类型 不属于基本数据类型
//   2 在java中 随便使用"" 括起来的都是String对象 例如 "abcx","dsad" ...
//   3 java中 规定 双引号括起来的字符串是不可变的 也就是说"abc"从出生到死亡都不能修改为"abcd"
//   4 在jdk当中 双引号括起来的字符串 都是直接存储在方法区(而不是在堆内存中)的字符串常量池中 因为字符串的使用过于频繁 为了效率

//    为什么SUN
public class String_Test01 {
    public static void main(String[] args) {
        String s1 = "abc";
    }
}

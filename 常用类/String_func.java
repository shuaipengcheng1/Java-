package 常用类;

public class String_func {
//    字符串的工具方法
public static void main(String[] args) {
//    常用方法
//    1 char charAt(int index)  返回指定下标的字符
String s1 ="Test01";
System.out.println(s1.charAt(3)); //t

//    2 int compareTo(String anotherString) 按照字典顺序比较 即 a b c d .... 比较规则 (先拿第一个字母比较 如果有区别 则不再比较 就以第一个字母为准 否则比较第二个字母 全部一样返回0)
    System.out.println("a".compareTo("ab")); //如果一样大返回0 前小后大返回1 前大后小返回-1 和equal很像(equal返回的是布尔)

//    3 boolean contains(String s) 判断一个字符串中 是否有指定的字符串 并且返回布尔值
    System.out.println("abc".contains("ab")); //true
    System.out.println("Java".contains("va")); //true
    System.out.println("http://".contains("https://")); //false

//    4   boolean endWith(String suffix)
//    判断当前字符串 是否以指定字符串结尾 返回布尔
    System.out.println("JavaScript".endsWith("t")); //true
    System.out.println("x.txt".endsWith(".java")); //false
    System.out.println("x.txt".endsWith(".txt")); //false

//    5  boolean equals(Object obj)  判断两个对象是否相等 一般需要重写 但是String的已经重写过了
    System.out.println("abc".equals("abc")); //true

//   6  boolean equalsIgnoreCase(String another) 判断两个字符串对象是否相等 并且忽略大小写
    System.out.println("Abc".equalsIgnoreCase("abc")); //true 无视大小写

//    7 Byte[] getByte()  将字符串对象 转为字节数组
    byte[] b = "abcd".getBytes();
    System.out.println(b[2]); //99 (c)


//     8  int indexOf(String str)   判断指定字符串 在对应的字符串中 并且返回第一次出现的索引
     System.out.println("abc".indexOf("b"));//1

//     9 boolean isEmpty()  判断字符串长度是否为0 返回布尔值
    System.out.println("".isEmpty());

//    10 String replace(String select ,  String repalce)  js中也有 用法一致 第一个参数为要替换的字符串 第二个是将要替换的字符串的替换的值
    System.out.println("abcd".replace("bcd","")); //将bcd 替换为""  也就是输出 a

//    11 String[] split(String key)  js中也有 拆分字符串 并且通过key字符串 来进行左右划分 并且将拆分后的字串符转为字符数组
  String [] arr=  "1234567".split("4");
  System.out.println(arr[0]); //123
    System.out.println(arr[1]); //567
    String [] arr2 = "1970-1-1".split("-");
    System.out.println(arr2[0]); //1970
    System.out.println(arr2[1]); //1
    System.out.println(arr2[2]); //1


//   12 boolean startWith(String str)  判断一个字符串 是否以指定的字符开始
    System.out.println("http://baidu.com".startsWith("http://")); //true

//  13 String subString(int beginindex)  截取字符串
    System.out.println("hello".substring(1)); //ello  截取结果包括起始的下标
//       String subString(int beginindex , int last )  截取一个范围的字符串
    System.out.println("hello".substring(1,3)); //el  截取结果中 只截取了1,2 包括起始下标 但是不包括结束下标

//  char[]  tocharArray ()  将一个字符串 转为char数组
char[] ch = "我是中国人".toCharArray();
System.out.println(ch[0]);//我

//   String tolowerCase() 转换为小写
    String s = "ADSSAD".toLowerCase();
//            String toUperCase() 转为大写
    String s2 = "dsadsad".toUpperCase();
    System.out.println(s);
    System.out.println(s2);

//    trim() js方法  去除字符串两侧的空白 会修改原字符串
    System.out.println("   hh    ".trim()); //h

//    String只有这一个方法是静态方法 valueOf() 将非字符串 转为字符串
    String s3 = String.valueOf(true); //将true 转为字符串
    System.out.println(s3); //true  只不过为字符串类型
//    当valueof的参数为一个引用数据类型时 会自动调用 该对象的toString() 但是C类还没有重写tostring() 所以s4的值 是C对象的地址值
    String  s4  =  String.valueOf(new C());
    System.out.println(s4); //常用类.C@16d3586 重写后 我是一个C
//    print 方法调用是 就是在底层中也执行了String,valueOf() 将输入的值转为字符串显示
    System.out.println(23);

}


}
class  C{
public   String toString(){
    return "我是一个C";
}
}
package 常用类;

public class String_Test04 {
//    关于String的常用的构造方法
public static void main(String[] args) {
//    1
    String s1  ="hello world";
//    2 传入一个byte数组
    byte[] bte={98,98,99};
    String str = new String(bte);
    System.out.println(str);  // bbc  根据byte数组中的值 再根据ASCll码 进行转义 并且因为输出对象本身会自动调用toString() 但是这里的结果 并不是一个地址 所以我们得知 字符串的toString() 方法已经重写过了
//    3
    String s3 =new String(bte,1,2); //传入一个byte数组 第二个参数 是转义起始下标 第三个是结束下标

    System.out.println(s3); //bc

//    将cHar数组 转为字符串
    char[] ch ={'i','a','c'};
    String s4 = new String(ch);
    System.out.println(s4); //iac
    String s5 =new String(ch,1,2);
    System.out.println(s5); //ac


}
}

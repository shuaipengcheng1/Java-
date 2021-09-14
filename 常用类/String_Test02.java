package 常用类;

public class String_Test02 {
    public static void main(String[] args) {
        String s1 ="hello";
        String s2 ="hello";
        System.out.println(s1==s2); //true  因为字符串对象都在方法区中 而hello 是同一个方法区 所以两个的地址相同
        System.out.println(s1.equals(s2)); //true
        String s3  = "hellox";
        System.out.println(s1==s3) ;  //false  //hellox 会新开辟一个空间 因为之前没有声明

        String s4  =  new String("xyz");  //通过构造方法创建字符串对象 new方法 会在堆内存中 开辟 一个空间
        String s5  =  new String("xyz");
        System.out.println(s4==s5);//false
        System.out.println(s4.equals(s5)); //true

    }
}

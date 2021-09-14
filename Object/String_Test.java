package Object;

public class String_Test {
    public static void main(String[] args) {
        //String 也是一个类 所以也就会extends Object 所以会拥有equals toString .. 方法 并且sun公司已经将String类中的equals 和 toString 重写了
//        所以string 肯定也有构造方法
        String s1 = "test";
        String s2 = "test2";
        String s3 = new String("test3");
        String s4 = new String("test3");
        System.out.println(s3==s4); //false 因为String 也是对象(引用数据类型)
//        String的toString() 和 equals sun公司已经重写过了  所以不需要我们再次重写

       System.out.println(s3.equals(s4)); //true
        String s5 = "misaka";
        System.out.println(s5.toString()); //misaka 但是无意义
    }
}

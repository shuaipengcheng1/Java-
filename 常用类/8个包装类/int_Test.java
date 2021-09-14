

public class int_Test {
    public static void main(String[] args) {
//        包装类都是Object的子类
//        传object的类型 但是 要传入一个数字(基本数据类型)进去 所以就要用到包装类

//        Integet是int类型的包装类
        Integer integer = new Integer(10);
//        也可以转换字符串
        Integer integer1 = new Integer("123");
//        Jdk1.5 之后 可以直接写 而不需要new
        Integer integer2 = 100;
//        也可以直接赋值
        int i = integer2;
//        也可以直接进行加减 因为java底层会对integer2 进行自动拆箱
        System.out.println(integer2+1);
//        Interger a  =1000 ;  a仍然是一个引用数据类型 而不是一个基本数据类型
        Integer a = 1000;
        Integer b = 1000;
        System.out.println(a==b); //false
        System.out.println(a.equals(b)); //true
//        而 java为了提高效率 底层将-127到128之间的所有数 放在了一个叫做"整数型常量池中"
//        池 就是 缓存机制(cache)
        Integer c = 100; //这里的c和d 保存的都是值为100的整数型常量对象 所以地址也是相等的
        Integer d = 100;
        System.out.println(c==d); //true

        Integer f =new Integer("123");
//        字符串类型的Integer也会在运算时 自动拆箱
System.out.println(f+100); //223


//      int  parseInt(String str) 将字符串转为10进制数字 该方法为Integer对象的静态方法
        int result = Integer.parseInt("1234567");
System.out.println(result);
Double re = Double.parseDouble("1.23");
System.out.println(re+10.2); //11.43

//        将十进制转16进制字符
//        静态方法 String toHexString(int i)
        String hex = Integer.toHexString(101);
        String hex2 = Double.toHexString(10.0);
        System.out.println("16进制  "+hex); //65


        dosome(integer);
        dosome(integer1);
    }
    public  static  void dosome(Object obj){
        if(obj instanceof Integer){
            System.out.println(obj); //10
//            使用Intger对象的方法
            System.out.println(((Integer) obj).floatValue());
        }

    }
}

package 浮点型;

 public class x {
//    浮点型 有float 和 double  double精度更高
//                          这里的String[]其实是调用了根目录中的String.class
    public static void main(String[] args) {
        float t = 10;
        System.out.println(t);
        double d = 10.3;
        System.out.println(d);
//        int类型和float相加 需要使用强制转换 但是会去除小数点后面的值
        int a = (int)d+10;
        System.out.println(a);
//        double 相加 int
        double f = (float)a+ 10.5;
        System.out.println(f);



    }
}

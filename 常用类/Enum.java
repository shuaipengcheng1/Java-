package 常用类;

public class Enum {


    public static void main(String[] args) {
        boolean c = divide(20, 0);
        System.out.println(c);
    }

    //    枚举
    public static boolean divide(int a, int b) {
        try {
//            try{}catch(){} 就是先会执行try里面的代码 如果有异常 则会执行catch
//            成功
            int c =a/b;
            return true;
        } catch (Exception e) {
//            失败
            System.out.println(e);
            return false;
        }

    }
}

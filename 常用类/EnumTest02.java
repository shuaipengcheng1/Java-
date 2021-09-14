package 常用类;

public class EnumTest02 {
    //    枚举
    public static void main(String[] args) {
System.out.println(divide(10,0)==Result.SUCCESS?"成功":"失败");
    }

    public static Result divide(int a, int b) {
        try {
            int c = a / b;
            return Result.SUCCESS;
        } catch (Exception e) {
            System.out.println(e);
            return Result.FAIL;
        }
    }

    //    枚举 一枚一枚可以列举的 才使用枚举
//   枚举也是引用
//枚举可以看作是一种标识  语义化的标识
//    总结 如果大于两种情况的使用枚举 两种的使用布尔值
    enum Result {
//        SUCCESS是Result枚举的一个值
//        枚举中每一个值 就要看作常量
    SUCCESS,FAIL;
    }
}

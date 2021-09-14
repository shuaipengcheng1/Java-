package 函数;

public class 重载 {
//方法重载 （overload） 将功能相似的函数整合
//使用重载机制的方法 将同一个函数名 设同样的函数体 设置不同的形参列表（数据类型 形参顺序 形参数量）
//    方法重载和返回值类型没有关系 和 public static 也没有关系
//    调用时 会根据传入的形参数据类型 自动匹配函数
    public static void main(String[] args) {
        int re = sum(10,20);
        System.out.println(re);
        double re2 = sum(10.3,10.5);
        System.out.println(re2);
        long re3  = sum(100L,200L);
        System.out  .println(re3);

    }


//    定义一个方法计算两个int的和
    public  static  int sum(int a,int b){
        return  a+b;
    }
//    定义一个方法计算两个double的和
public  static  double sum(double a,double b){
    return  a+b;
}
//    定义一个方法计算两个long的和
public  static long sum(long a,long b){
    return  a+b;
}

}

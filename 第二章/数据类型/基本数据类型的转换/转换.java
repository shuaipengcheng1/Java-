package 基本数据类型的转换;

public class 转换 {
//    规则 八种基本数据类型 除了bool 其他都能互相转换
//    小容量 向大容量转换为自动类型转换 下面是从小到大的排序
//    大容量 转小容量 就需要 强制类型转换
//    并且浮点型要比整数型要大 并且字符型 与short同等
//    byte short char 运算时 都转为int类型 进行运算
//    1     2   4     8   4     8
//    byte short int  long float double
           //2
          // char
//doubel d = 10/3;  结果为3.0 因为10/3得到的是int型   然后就等于是double d=3   所以为3.0

//    long g = 100;
//    int 调用long类型 就需要强制转换 int a = (int)g+10;
    public static void main(String[] args) {
//        大的转小的 float接收int 可以直接接
        float f  = 3;
        double f2 =3.0;
//        long同理
 int i =10;
 long l = i;
// char型 转换是基于ascal码
char c =97;
        System.out.println(c);
    }
}

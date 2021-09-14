package 接口;

public class test01 {
    public static void main(String[] args) {
  System.out.println(MyMath.PI);
//  MyMath.PI = 3.2; 在接口中定义的变量 就算没有修饰符final 也是常量
        MyMath m  = new MyMath() {
            @Override
            public int sum(int a, int b) {
                return  a+b;
            }

            @Override
            public int jian(int a, int b) {
                return a-b;
            }
        };
        m.jian(10,20);
    }
}
 interface  A{

}
interface C{

}
interface  B extends  A,C{

}

interface MyMath{
    int k=10;
//    public  abstract int sum(int a,int b);
//    在接口中的方法都是抽象方法 所以可以缩写 返回值 函数名(形参)；
//    public static final double  PI = 3.14;
//   上面的代码 可以缩写为 在接口中的变量都是 常量(final)
    double PI =3.14;
    int sum(int a,int b);
//    接口中的函数都不能有函数体
//    void test(){
//       //接口 abstract 方法不能有主体
//    }
    int jian(int a,int b);

}


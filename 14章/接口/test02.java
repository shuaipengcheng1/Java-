package 接口;
/*
* 类和类之间叫做继承 而 类和接口叫做实现\
* 继承使用 extends
* 实现使用 implements
* */
public class test02 {
    public static void main(String[] args) {
        Mymat m = new h();
        System.out.println(m.sum(10,20));

    }
}
//定义一个接口
interface Mymat{
    double PI = 3.14; //final是不会继承的
    int sum  (int a,int b);
    int sub (int a,int b);
}
//编写一个类 为非抽象类
class h implements Mymat{
  public int sum(int a,int b){
return a+b;
 };
 public int sub(int a,int b){
      return a-b;
 };
}
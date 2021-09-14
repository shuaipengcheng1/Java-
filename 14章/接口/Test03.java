package 接口;

public class Test03 {
    public static void main(String[] args) {
//        多继承 使用多态  可以使用任意一个父接口 但是也要通过编译 也就是只能调用 父元素的方法 如果想要调用子元素的其他的方法 就要用强制类型转换
        F f = new D();
        f.mi();
//        强制类型转换
       D d = (D)f;
       d.mi2();
    }
}
interface  F{
    void mi();

}
interface  F2{
  void mi2();
}
interface   F3{
void mi3();
}
class D implements  F,F2,F3{
//     接口的多继承机制
   public void mi(){
System.out.println("我是子元素的方法");
    }
    public void mi2(){
System.out.println("我是继承的f2的方法");
    }
    public void mi3(){

    }
}

package Object;

public class 匿名内部类i {
//    内部类 类中套一个类 嵌套类
//    分类
//    静态内部类：类似于静态变量
//    实例内部类：类似于实例变量
//    局部内部类: 类似于局部变量
//匿名内部类 是属于局部内部类中的
public static void main(String[] args) {
    Mymath m = new Mymath();
//    接口的实现类
//    Computed c = new Comoputed_use();
    m.sum(new Computed() {
//        匿名内部类 可以不写实现类了 直接 new 接口(){重写函数(实现)}
        @Override
        public int sum(int a, int b) {
            return a+b;
        }
    }, 10, 20);
}

}
class Test01{
//    static修饰 叫 静态内部类
    static  class Test04{

    }
//    该类在类的内部 所以为 内部类
//    没有static叫实例内部类
    class Test02{


    }
    //    该类在类的内部 所以为 内部类

    class Test03{

    }
    public void dosome(){
//        在函数体中叫 局部内部类
        class Test05{

        }


    }
}
//计算的接口
interface Computed{
    int sum(int a,int b);
}
//实现接口的
//如果使用 匿名内部类 可以不写实现接口的的类
//class Comoputed_use implements Computed{
//    public int sum(int a,int b){
//        return a+b;
//    }
//}
class Mymath{
//调用接口的
    public void sum(Computed c,int a,int b){
       int value= c.sum(a,b);
       System.out.println(value);
    }
}
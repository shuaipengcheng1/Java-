package 抽象类;

import test.A;

public class test02 {
    public static void main(String[] args) {
//        多态  面向抽象编程 降低耦合度
Animal c = new Cat();
//子转父 自动类型转换
c.move();
//使用子类方法
//        类型转换
        Cat c1 = (Cat) c;
        c1.Catch();
    }
}
//定义一个抽象类
abstract class  Animal{
//    定义一个抽象方法
  public   abstract void move();
}
//子类 cat
class Cat extends  Animal{
//    重写 注意!! 在非抽象类继承抽象方法时 必须将抽象的方法补全 (这是java公司强行要求的！！)

    public void move(){
        System.out.println("喵");
    }
    public void Catch(){
        System.out.println("抓老鼠");
    }

}
abstract class fly extends Animal{
    //    而抽象类 继承 抽象类 就不需要重写 也不会报错!!!!!
    //    而抽象类 继承 抽象类 就不需要重写 也不会报错!!!!!
//    public abstract void move();

//    总而言之 抽象方法 必须出现在抽象类中!!!!!
}
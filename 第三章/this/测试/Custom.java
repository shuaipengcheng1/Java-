package 测试;

public class Custom {
//    客户类 这些变量都是实例变量(无static) 只能通过实例化.变量名 来调用
    String name;
    int age;
    String gender;
//    静态变量 通过类来调用
  static   String run2="运行";

//  (不加static就是实例方法(调用 类.方法名()) 加了就是类方法)  客户的实例化方法 调用方式是 实例化对象.方法名()
    public void buy(){
        System.out.println(this.name==""?"名字不能为空":this.name+"购买");
    }
//    创建一个类方法
    public static  void run(){
        System.out.println(run2);
    }
//    构造函数
    public Custom(String n,int a,String g){
        this.name=n;
        this.age=a;
        this.gender=g;

    }

}

package 测试;

public class test3_this {
//    创建main
public static void main(String[] args) {
//    调用static方法的方式
//    第一种调用方式
    test3_this.dosome();
//    第二种
    dosome();

//    调用实例方法
   test3_this tt = new test3_this();
   tt.run();
}
public static  void dosome(){
System.out.println("dosome");
}
public void run1(){
    System.out.println("run1");
}
public void run(){
    System.out.println("run");
//    在该方法中调用另一个实例方法
//    因为该实例方法一定是被实例化对象调用的 所以会有this
 this.run1();
}
}

package 测试;

public class test6_this {

    public static void main(String[] args) {
//        test6_this.method1(); //这种也可以

//调用method1 和 method2
        method1();
        test6_this tt =new test6_this();
        tt.method2();
//        tt.method1(); //这里通过实例访问static方法 可以编译通过
//        tt=null;
//        tt.method1(); //这里不会包错 因为用实例化对象调用method1 程序会自动改为 类. 的方式 也就是 test6_this.method1();
    }
    public  static void method1(){
System.out.println("m1");
//调用dosome1 因为dosome1有static 所以为静态的方法 在类中可以直接调用 在外部 就必须用类名.的方法调用
        dosome1();
    }
    public  void method2(){
System.out.println("m2");
//调用dosome2 由于该方法(m2)也是一个 实例化方法 实例化方法必须由实例化对象调用 所以有this  这里的dosome2() 也就是this.dosome2的简写
        this.dosome2();
    }

    public static void dosome1(){
        System.out.println("dosome");
    }
    public  void dosome2(){
        System.out.println("dosome2");
    }
}

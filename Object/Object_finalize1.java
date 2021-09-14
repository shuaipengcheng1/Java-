package Object;

public class Object_finalize1 {
//finalize方法 这个方法是protected 修饰的
//    finalize方法不需要我们调用 JVM的垃圾回收器负责调用该方法
//当java对象 即将被回收的时候 就会调用
//    finalze方法实际上是sun公司为java程序员准备的一个生命周期(时机) 垃圾烧毁时机 如果希望在对象销毁时 执行代码 这段代码写在finalize中
//    与静态代码块很像
//    static{}  静态代码块 触发时机是在 类加载时触发
public static void main(String[] args) {

//垃圾回收器 不会一直开 会看类的大小  和垃圾数量 然后进行回收
//    for(int i=0;i<1000000;i++){
//        Person p = new Person();
//        p=null;
//    }
//    然后有一行代码 会建议垃圾回收器启动    System.gc();
    Person p = new Person();
    p=null;
    System.gc();


}
}
class Person{
//    重写finalize方法

    protected void finalize() throws Throwable {
        System.out.println(this.getClass());
    }
}


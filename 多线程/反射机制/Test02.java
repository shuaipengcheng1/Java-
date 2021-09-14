package 反射机制;

public class Test02 {
    /*
    * class.forName() 执行了什么
    *
    * */
    public static void main(String[] args) {
        try {
            Class c=   Class.forName("反射机制.Myclass"); //Myclass静态代码块执行了 forName只会调用类的静态代码块 如果想执行一个类的静态代码块 那么就调用Class.forname("完整类名“)

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
class Myclass{
    static {
//        静态代码块 在类加载时进行
        System.out.println("Myclass静态代码块执行了");
    }
}

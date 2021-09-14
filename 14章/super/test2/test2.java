package test2;

public class test2 {
    public static void main(String[] args) {
new C();
/*顺序如下
*
* 这是A的无参数
这是b的name
这是c的super
这是c的name age
这是c的无参数
* */
    }
}
class A{
    public  A(){
        System.out.println("这是A的无参数");
    }
}
class B extends  A{
    public  B(){
        System.out.println("这是b的无参数");
    }
    public B(String name){
//        这里如果没有this() 或则 super() 那么会默认有一个suepr()
        System.out.println("这是b的name");
    }
}
class C extends  B{
    public  C(){
     this("张三");
        System.out.println("这是c的无参数");
    }
    public C(String name){
        this(name,18);
        System.out.println("这是c的name age");
    }
    public C(String name ,int age){
        super(name);
        System.out.println("这是c的super");
    }
}

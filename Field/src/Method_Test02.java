import java.lang.reflect.Method;

public class Method_Test02 {
//    通过反射机制 调用方法
public static void main(String[] args) throws Exception {
//    创建calss
    Class c  =Class.forName("UserService");
    Object obj =c.newInstance();
//    获取指定的方法                  getMethod(方法名,形参数据类型的class)
    Method method =c.getMethod("login", String.class, String.class);
//    调用
   Object o = method.invoke(obj,"admin","12345"); //这行代码意思是 调用对象的login方法 并且传递admin和12345 作为形参
//    查看返回值
    System.out.println(o); //false
}
}

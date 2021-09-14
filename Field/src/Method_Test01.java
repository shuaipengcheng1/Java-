import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Method_Test01 {
    /*
    * 反射机制
    *  反射Method
    *
    * */
    public static void main(String[] args) throws  Exception {
//        获取class
Class c =Class.forName("UserService");
//获取所有的方法(Method)数组(包括私有方法!!!)
        Method[] methods= c.getDeclaredMethods();
        for (Method item:methods
             ) {
            System.out.println(item.getName()); /*exit
                                                 login
*/
            System.out.println(item.getReturnType()); //获取返回值类型void boolean
//            获取修饰符
            System.out.println(Modifier.toString(item.getModifiers()));
//获取参数
          Class[] classes=  item.getParameterTypes();
            for (Class tem:classes
                 ) {
                System.out.println(tem.getSimpleName()); //String
//                                                         String
            }
        }
    }
}

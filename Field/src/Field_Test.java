import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Field_Test {
    public static void main(String[] args) {

        try {
            Class c    =Class.forName("Student");
            Field[] fields =c.getFields(); //该方法只能获取pubilc
            Field [] fields1 = c.getDeclaredFields(); //获取所有的filds
//            for (Field item:fields
//                 ) {
//                System.out.println(item); //public java.lang.String Student.name
//                System.out.println(item.getName()); //name
//                System.out.println(item.getType()); //class java.lang.String
//            }
            for (Field item:fields1
            ) {
//                System.out.println(item);
//                属性名
                System.out.println(item.getName());
//                属性类型
                System.out.println(item.getType());
//                属性修饰符返回int
//                System.out.println(item.getModifiers());
//                然后将返回的值 转为字符串 toString 静态方法
            System.out.println(Modifier.toString(item.getModifiers()));

            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}

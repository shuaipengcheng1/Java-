import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class 反编译 {
//    通过Field反编译类
public static void main(String[] args) throws Exception {
//    拼接字符串
    StringBuilder s =new StringBuilder();
    //获取类
//    Class c  = Class.forName("Student");
    Class c =Class.forName("java.lang.String");
//    拼接字符串
    s.append("public class "+c.getSimpleName()+"{\n");
//    获取所有的属性
    Field[] fields =c.getDeclaredFields();
    for (Field item: fields
         ) {
//        拼接字符串 \t制表符(缩进)
        s.append("\t"+Modifier.toString(item.getModifiers()) +" "+item.getType()+" "+item.getName()+";\n");
    }
    s.append("}");
    System.out.println(s);
}
}

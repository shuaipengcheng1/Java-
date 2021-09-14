import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

public class 反编译方法 {
    public static void main(String[] args) throws Exception {
//        拼接字符串
        StringBuilder stringBuilder = new StringBuilder();
        Class c = Class.forName("UserService");
        stringBuilder.append(Modifier.toString(c.getModifiers())+" class "+c.getSimpleName()+"{\n");
//        获取所有的方法
        Method[] methods = c.getDeclaredMethods();
//        循环
        for (Method item : methods
        ) {
            stringBuilder.append("\t");
//            获取修饰符
            stringBuilder.append(Modifier.toString(item.getModifiers()) + " ");
//            获取函数名
            stringBuilder.append(item.getName());

            //            获取形参
            stringBuilder.append("(");
            Parameter[] parameters = item.getParameters();
            for (int i = 0; i < parameters.length; i++) {

                stringBuilder.append(parameters[i].getType().getSimpleName() + " " + parameters[i].getName() + ",");
            }
            stringBuilder.append("){}\n");


        }
        stringBuilder.append("}");
        System.out.println(stringBuilder);


    }
}

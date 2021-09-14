import java.lang.reflect.Field;

public class Field_Test01 {
    public static void main(String[] args) throws Exception {

//   通过反射创建class对象
        Class c = Class.forName("D:\\java\\AboutPath\\src\\Student.java");
        Field[] fields = c.getFields();
    System.out.println(fields.length);


    }
}

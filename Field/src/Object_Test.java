import java.lang.reflect.Field;

public class Object_Test {
    /*
    * 怎么通过反射机制 访问对象的属性并且修改
    * */
    public static void main(String[] args) throws  Exception{
//        以前
        Student student =new Student();
        student.name="misaka";
        System.out.println(student.name);
//        反射
        Class<Student> c  = (Class<Student>) Class.forName("Student");
      //通过class创建对象
       Student student1= c.newInstance();
//       修改public修饰的属性 --------------------------
//       获取对象的name属性
    Field field= c.getDeclaredField("name");
//    赋值   field对象.set(要赋值的对象,值); (赋值的属性为field对象的属性)
    field.set(student1,"xxx");//也就是给student1对象的name属性赋值"xxx"
//获取指定对象的name属性的值 传入一个对象
        System.out.println(field.get(student1)); //xxx
//        -------------------------------------------

//       修改private属性修饰的age
        Field field1 =c.getDeclaredField("age");
//        打破封装
        field1.setAccessible(true);
//        修改age
        field1.set(student1,10);
//        获取age
    System.out.println(    field1.get(student1)); //10


    }
}

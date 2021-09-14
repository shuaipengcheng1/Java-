/*
* 这就是自定义的注解 Test02
* 有什么用??
*
* 使用方法 :
* @注解名
* 可以用在类上 方法上 属性上 变量上 接口等等...
* 注解还可以同在注解上
* */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//标注注解可以修饰方法和类
@Target({ElementType.TYPE,ElementType.METHOD})
//修饰注解可以被反编译 反射
@Retention(RetentionPolicy.RUNTIME)
public @interface Test02 {
//    这是注解的属性
String name();
}

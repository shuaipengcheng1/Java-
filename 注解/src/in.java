import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
//可以用在类上面
@Target(ElementType.TYPE)
//可以被反射机制 读取
@Retention(RetentionPolicy.RUNTIME)
public @interface in {
}

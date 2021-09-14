package 访问控制权限控制;
import 包机制.User;
public class test {
    public static void main(String[] args) {
        User user  = new User(18);
//user.name=""; protect修饰的变量or方法不能被修改 也就是只读
    }
}

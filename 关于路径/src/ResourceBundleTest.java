import java.util.ResourceBundle;

public class ResourceBundleTest {
    /*
     * 资源绑定器 用于获取 属性配置文件(.properties)的内容
     * 也只能读取src文件中的文件
     *
     * */
    public static void main(String[] args) {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("class"); //不需要提供后缀
        String user = resourceBundle.getString("user"); //通过Key返回
        System.out.println(user);
    }
}

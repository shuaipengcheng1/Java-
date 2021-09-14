import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Properties;

public class 关于路径 {
    //    关于文件路径的问题
    public static void main(String[] args) throws Exception {
        //通用的路径 即使代码换位置 也可以
        // 前提要在 模块里的 src文件里面 也就是类的根路径(src)


        // 获取文件的绝对路径
        //                                  获取类加载器对象                       【从src根路径获取指定资源】\
        // 如果直接复制 只能在windows上使用 在linux 和 windows就不适用了 但是下面的方法就可以跨系统获取
        String path = Thread.currentThread().getContextClassLoader().getResource("class.properties").getPath();
        System.out.println(path); ///D:/java/out/production/AboutPath/class.properties

//       读取属性文件
        FileInputStream fileInputStream =  new FileInputStream(path);
//        创建属性对象
        Properties properties= new Properties();
        properties.load(fileInputStream);
//        通过类的完整路劲创建对象 通过反射机制 并且使用泛型
        Class<test> c = (Class<test>) Class.forName(properties.getProperty("user"));
//     创建对象
     test t=   c.newInstance();
System.out.println(t);
    }
}




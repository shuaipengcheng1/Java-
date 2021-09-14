package 反射机制;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

public class 验证反射机制的灵活性 {
    public static void main(String[] args) throws Exception {
//       读取属性文件
        FileReader fileReader = new FileReader("D:\\java\\反射机制\\class.properties");
//创建属性map
        Properties properties = new Properties();
        properties.load(fileReader);
        System.out.println(properties.getProperty("ClassSrc")); //反射机制.bean.User\
//通过反射机制实例化
        Class c = Class.forName(properties.getProperty("ClassSrc"));
//      newInstance创建对象
        System.out.println(c.newInstance());//反射机制.bean.User@16d3586
    }
}

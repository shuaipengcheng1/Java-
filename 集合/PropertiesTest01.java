package 集合;


import java.util.Map;
import java.util.Properties;

//propties 是一个map集合 继承了Hashtable类 key和value 必须为 String类型
//该类被称为属性类对象
//线程安全的
public class PropertiesTest01 {
    public static void main(String[] args) {
//    创建一个properties对象
        Properties properties = new Properties();
//        存入
        properties.setProperty("user", "misaka");

//取出 通过key获取
        String value = properties.getProperty("user");
        System.out.println(value);


    }
}

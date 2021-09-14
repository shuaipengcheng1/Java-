package IO与Properties联合使用;

import java.io.FileInputStream;
import java.util.Properties;

public class Retest {
//    复习
public static void main(String[] args) throws Exception {
    FileInputStream  fileInputStream= new FileInputStream("D:\\java\\IO流\\src\\IO与Properties联合使用\\info.properties");
//创建一个properties
    Properties properties= new Properties();
    properties.load(fileInputStream);
    System.out.println(properties.getProperty("admin"));
}
}

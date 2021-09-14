package IO与Properties联合使用;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Properties;

public class Test01 {
    /*
    * IO流 文件的读写
    * Properties 是一个Map集合 key value 是 string
    * 想把同目录下的info文件的内容 加入到 一个properties 集合中
    * */
    public static void main(String[] args) throws Exception {
//        新建输入流(读) 硬盘->内存
        FileInputStream fileInputStream= new FileInputStream("D:\\java\\IO流\\src\\IO与Properties联合使用\\info.properties");
//新建map
        Properties properties= new Properties();
//        调用properties的load方法 参数是一个FileReader 或者 InputStream
//        这里复习转类型 字节流 转 字符流 InputStream -> Reader
        properties.load(new InputStreamReader(fileInputStream));//其中 文本中的 = 左边为key = 右边为value
      String s=  properties.getProperty("admin"); //properties的key value 都是String
      System.out.println("admin:"+s); //admin:misaka

//        经常修改的数据 就可以存储在一个文件中
//        这种文件也叫做配置文件
//        并且格式为:  key = value 的时候 我们叫这种文件叫 属性配置文件

//       java的规范 属性配置文件 建议以properties 结尾  不是必须的!! 只是建议
//        并且properties的key重复 新value将会覆盖旧value 就和 map一样


    }
}

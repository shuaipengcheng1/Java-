import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class test02 {


    public static void main(String[] args) throws Exception {


//        以读取流的形式返回
    InputStream inputStream =    Thread.currentThread().getContextClassLoader().getResourceAsStream("class.properties");
Properties propertie  = new Properties();
propertie.load(inputStream);
//通过value给的类的完整路劲 创建对象
        Class<test>  c = (Class<test>) Class.forName(propertie.getProperty("user"));
      test t=  c.newInstance();
      System.out.println(t);
    }


}


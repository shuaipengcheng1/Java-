package 标准输出流;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LogUtill {
//    日志工具
 static void Use(String str)  {
    try {
        System.setOut(new PrintStream(new FileOutputStream("log",true)));
//        生成一个时间 格式
        SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd HH-mm-ss SSS");
        Date date = new Date();
//        生成时间
       String s = sdf.format(date);
//       输出
        System.out.println(s+" "+
                            str);
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }
}
}

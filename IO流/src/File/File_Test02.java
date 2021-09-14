package File;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class File_Test02 {
    public static void main(String[] args) {
        File file = new File("log");
        System.out.println(file.getName()); //获取文件名 log

//        判断是否是一个文件夹
        System.out.println(file.isDirectory());//false
//        判断是否是一个文件
        System.out.println(file.isFile());//true
//        返回最后的修改时间
//        System.out.println(file.lastModified()); //1627285908408返回的是时间戳
//        构建日期对象 并传入时间戳
        Date date = new Date(file.lastModified());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss SS");
       String str= sdf.format(date);
       System.out.println("最后修改时间是"+str); //最后修改时间是2021-07-26 15-51-48 408
    }
}

package File;

import java.io.File;

public class File_Test03 {
//    获取指定目录下的所有子文件 并且存储在一个File[]数组中
public static void main(String[] args) {
   File file = new File("C:\\Users\\misak\\Desktop");
//   获取所有的子文件文件
    File[] files = file.listFiles();
//    循环
    for (File item:files
         ) {
        System.out.println(item.getAbsolutePath());
    }
}
}

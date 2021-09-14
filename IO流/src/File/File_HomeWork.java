package File;

import java.io.*;

public class File_HomeWork {
//    将一个目录 全部拷贝 到另一个地方
    static void Copy_List(String Start_src,String Arrow_src,String dir_Name){
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
//    获取需要拷贝的目录D:\x
        File file = new File(Start_src);
//        在新的地方 创建
        File file1 = new File(Arrow_src+dir_Name);
        if (!(file1.exists())) {
            try {
//                创建目录
                file1.mkdir();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (file.exists()) {
//        获取所有的子文件
            File[] files = file.listFiles();
            System.out.println(files.length);

//       循环 并且读取兼写入
            for (File item : files
            ) {


                try {
                    //如果是文件夹
                    if(item.isDirectory()){

                        //                    创建文件
                        File file2 = new File(Arrow_src +dir_Name+ item.getName());
                        if(!(file2.exists())){
                            file2.mkdir();
                        }
//                    递归循环
                        File_HomeWork.Copy_List(item.getAbsolutePath(),Arrow_src,item.getName()+"\\");
                    }

                    //                    获取名字
                    String name = item.getName();
//                    创建文件
                    File file2 = new File(Arrow_src+dir_Name + name);
                    System.out.println(name);
                    if (!(file2.exists())) {
//                        创建文件
                        file2.createNewFile();
                    }


//                    获取他们的路劲 并且读取 数据
                    fileInputStream = new FileInputStream(item.getAbsolutePath());
//                    一次读取的大小
                    byte[] bytes = new byte[fileInputStream.available()];

                    int count = 0;
//                    开始读取
                    fileInputStream.read(bytes);

//                    写入数据
                    fileOutputStream = new FileOutputStream("D:\\java\\通过File复制文件夹\\" + name);
//                        写入
                    fileOutputStream.write(bytes);

                    fileOutputStream.flush();

                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
File_HomeWork.Copy_List("D:\\x","D:\\java\\通过File复制文件夹\\","");
    }
}

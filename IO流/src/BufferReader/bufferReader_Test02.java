package BufferReader;

import java.io.*;

public class bufferReader_Test02 {
    /*
     *
     * */
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("D:\\java\\IO流\\src\\Writer.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
//        包装流  不能接收 字节流 只能接收字符流 怎么办? 通过转换流转换InputStreamReader 构造函数传一个Stream(字节流) 就可以转为(字符流)
//        然后就可以 传入buffer里面了
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String s = null;

        //循环
        try {
            while (((s = bufferedReader.readLine()) != null)) {
                System.out.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}

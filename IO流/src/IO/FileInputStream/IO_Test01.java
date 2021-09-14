package IO.FileInputStream;

import java.io.FileInputStream;

public class IO_Test01 {

    /*
     * java.io.FileInputStream
     *  1 文件字节输入流 万能流 任何 文件都可以通过该方法读取
     *  2 字节输入流 通过字节的方法 完成输入 or 读的操作
     * */
    public static void main(String[] args) {
//        FileInputStream fileInputStream  =new FileInputStream(src路径);
        FileInputStream fileInputStream = null;
        try {
//         该方法 要使用try catch 因为有抛出错误    public FileInputStream(String name) throws FileNotFoundException {}
            fileInputStream = new FileInputStream("D:\\java\\IO流\\src\\io.txt");
    /*     System.out.println(fileInputStream.read()); //104字节码 也就是 h
         System.out.println(fileInputStream.read());// e
         System.out.println(fileInputStream.read());// l
         System.out.println(fileInputStream.read());// l
         System.out.println(fileInputStream.read());// o
         System.out.println(fileInputStream.read());// 空格
         System.out.println(fileInputStream.read());// J
         可以循环吗??
         */

//            在读取完毕时
            while (true){
                int data =   fileInputStream.read();

                if(data==-1){
                    break;
                }
                System.out.println(data);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
//         在运行结束时关闭流 这个比判断好 因为finnaly 的 语句 是必须执行的(除非调用 System.exit(0))

//          先确认 流不为null 避免空指针异常
            if (fileInputStream != null) {
                try {
//                 public void close() throws IOException 该方法也有错误抛出
                    fileInputStream.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

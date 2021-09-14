package BufferReader;

import java.io.*;

public class BufferReader_Test01 {
    //    自带缓冲区字符流 使用这个时 不需要自定义char[] 或者 byte[] 自带缓存
    static BufferedReader bufferedReader;
    static FileReader fileReader;

    public static void main(String[] args) {
        try {
            fileReader = new FileReader("D:\\java\\IO流\\src\\Writer.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
//    该类的构造函数 需要传入一个Reader对象 fileReader是他的实现类 根据多态 可以使用
//    并且这种构造函数 需要一个流作为参数的 它所创建的实例化对象叫做包装流 参数叫做节点流
//        像当前的来说 fileReader是节点流  bufferedReader叫做包装流
//
        bufferedReader = new BufferedReader(fileReader);


        try {
            //    BufferedReader 的好处是 他有一个方法叫做 readerLine() 直接返回String 读取一行文本(因为是字符流 所以只能读取文本)
//             如果已经读取到末尾 就为返回null
            String s;
            int i = 0;
//          循环读取
            while ((s = bufferedReader.readLine()) != null) {
                ++i;
                System.out.println("第" + i + "行是  " + s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close(); //这里 该类在底层中 调用的是in.close() 而in就是我们传入的Reader
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

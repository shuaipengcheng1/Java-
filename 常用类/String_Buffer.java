package 常用类;

import java.util.Arrays;

public class String_Buffer {
    public static void main(String[] args) {
//        在频繁的使用+ 进行字符串拼接 会发生什么问题？
//        例如
//        “misaka”+"xxx"   这种拼接方法会在方法区内存中 添加三个字符串常量对象 "misaka", "xxx" , "misakaxxx"

//        如果以后要进行大量的字符串拼接 建议使用StringBuffer 和 StringBuild
        StringBuffer StingBuffer = new StringBuffer();
        StingBuffer.append("s");
        StingBuffer.append("p");
//        这个toString 方法 也是重写了
        System.out.println(StingBuffer.toString());
//指定容量的StringBuffer
        StringBuffer stringBuffer = new StringBuffer(100);
        stringBuffer.append("sdadsa");
        stringBuffer.append("1231312");
        System.out.println(stringBuffer);



        int[]  arr ={10,20,30};
        int[] arr2 =  new int[10];
        System.arraycopy(arr,0,arr2,0,2);
        for (int i = 0; i < arr2.length ; i++) {
            System.out.println(arr2[i]);
        }

    }
}

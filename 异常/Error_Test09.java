package 异常;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
* 关于 try catch 中的finally子句
*   1 在finally子句中的代码 是最后执行的 并且是一定会执行的 即使有异常
*   2 场景?
*
* */
public class Error_Test09 {
    public static void main(String[] args) {
//        定义为全局变量
        FileInputStream fis = null;
        try {
       fis=   new FileInputStream("c");
//         读取中>>>
           Object c =null;
//           这里一定会报错 空指针
           c.toString();
//           关闭流 但是上面一行如果报错 这一行就决定无法运行 所以 我们要使用 finally
           fis.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
//            在finally里面 关闭流 因为是最后运行 并且 一定会运行 类似与 生命周期 ComponentWillUnMount(组件卸载时)
            if(fis!=null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("hello");
    }
}

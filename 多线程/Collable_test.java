package 多线程;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class Collable_test {
//    创建线程的第三种方式
public static void main(String[] args) throws Exception {
//    创建未来任务对象
    FutureTask<Integer> futureTask= new FutureTask(new Callable() {
        @Override
        public Object call() throws Exception { //这里的Collable匿名内部类 里面的方法 就相当于run方法
            for (int i = 0; i <100 ; i++) {
                System.out.println("分支线程--->"+i);
            }
            return 100; //自动装箱
        }

    });
    //        封装 为 线程对象
    Thread thread =new Thread(futureTask);
//    启动线程
    thread.start();
//    获取返回值 这个函数会阻塞当前线程的运行 因为他会等待call方法执行结束获取返回值后 再运行
    Integer i =futureTask.get();
    System.out.println("返回值--->"+i);

}
}

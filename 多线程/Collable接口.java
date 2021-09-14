package 多线程;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class Collable接口 {
    /*
     * 实现该接口 可以接收run方法的返回值
     *
     * */
    public static void main(String[] args) throws Exception {
//        创建一个 "未来任务类"对象 参数需要一个Collable接口对象 使用匿名内部类
        FutureTask<Integer> futureTask = new FutureTask(new Callable() {
            @Override
            public Object call() throws Exception { //call 方法 相当于run方法 只不过有返回值 返回一个对象
                System.out.println("call begin");
                Thread.sleep(1000);
                System.out.println("call end");
                Thread.sleep(5000);
                return 100; //自动装箱为Integer

            }
        }); //java.util.concurrent该类是Juc包下的 java的并发包 新特性
//将 "未来任务对象" 传入到 Thread的构造方法中
        Thread thread= new Thread(futureTask);

        thread.start();
//        获取返回值 通过未来任务对象.get(); 就会获取该线程call的返回值
//        该方法压栈在 main（当前get所在线程）线程中的 而不是支线程 所以会阻塞main运行
//        并且该方法 会一直等待 对应线程执行完毕 所以get方法会使main（当前get所在线程）方法受阻
//        所以效率较低
      Integer integer=  futureTask.get();
      System.out.println(integer);

        System.out.println("hello");

    }
}

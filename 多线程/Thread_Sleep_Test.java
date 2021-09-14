package 多线程;
/*
* 关于线程的sleep方法
*  static void sleep(毫秒) : 是Thread的静态方法 让当前线程进入休眠（阻塞 释放cpu执行权 给其他线程使用） 持续(参数)毫秒
*
* 该方法可以做到 间隔一段时间后 再执行一段代码
* */
public class Thread_Sleep_Test {
    public static void main(String[] args) throws Exception {
//        每隔一秒 执行一次
        for (int i = 0; i <10 ; i++) {
            Thread.sleep(1000);
            System.out.println("第"+i+"次");
        }

//创建线程对象 新建状态
        Sleep_Test sleep_test = new Sleep_Test();

//        开启 就绪状态 开始争夺cpu执行权
        sleep_test.start();

        System.out.println("main 休眠两秒");
        //休眠 2s 释放当前线程的cpu执行权 给其他的线程 进入阻塞状态
        Thread.sleep(2000);
        System.out.println("休眠完毕");
        for (int i = 0; i <100 ; i++) {
System.out.println("主线程->"+i);
        }
    }
}
class Sleep_Test extends  Thread{
    @Override
    public void run() {
//        运行状态 争夺cpu执行权成功
        for (int i = 0; i <100 ; i++) {
            System.out.println("分支-->"+i);
        }

//        run 执行结束 死亡状态
    }
}

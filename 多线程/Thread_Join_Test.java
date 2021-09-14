package 多线程;

public class Thread_Join_Test {
//    join 将两个线程合并 为单线程
public static void main(String[] args) {
 Test_JOIN test_join = new Test_JOIN();
 test_join.start();
    try {
        test_join.join(); // 将test_join线程合并到main中 等于是将该线程的run函数的函数体 放在了这里
                          // main函数(当前线程(Thread.currentThread()))进入阻塞状态 在test_join 线程结束时(run弹栈时) main函数进入就绪状态 并继续运行
                          // 相当与多线程 转为 单线程
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    System.out.println("Test_join 结束 main线程结束阻塞状态");
      /* 运行结果
    * 分支线程-->0
分支线程-->1
分支线程-->2
分支线程-->3
分支线程-->4
Test_join 结束 main线程结束阻塞状态
    * */

}

}
class Test_JOIN extends  Thread{
    @Override
    public void run() {
        for (int i = 0; i <5 ; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("分支线程-->"+i);
        }
    }
}

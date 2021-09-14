package 多线程;

public class Thread_Test08 {
//   强制 终止 一个线程的运行
public static void main(String[] args) {
    MyRunnable03 myRunnable03 = new MyRunnable03();
    Thread thread= new Thread(myRunnable03);
    thread.setName("misaka");
//    开启线程
    thread.start();

//    5秒后 强行关闭线程
    try {
        Thread.sleep(1000*5);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
//    关闭线程
    thread.stop(); //已过时 不建议使用 因为容易丢失数据
                  // 因为是直接结束 没有保存的数据 就直接丢失了
}

}
class MyRunnable03 implements  Runnable{
    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            System.out.println("分支线程-->"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
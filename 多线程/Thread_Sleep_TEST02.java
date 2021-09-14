package 多线程;
/*
* 如何强行终止线程睡眠
* */
public class Thread_Sleep_TEST02 {
    public static void main(String[] args) {
MyRunnable myRunnable= new MyRunnable();
Thread thread = new Thread(myRunnable);
thread.setName("misaka");
thread.start();
//五秒后 misaka 线程醒来
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.interrupt(); //叫醒
    }
}
class MyRunnable implements Runnable{
//    run方法的异常 不能抛出 只能try 因为父类中没有抛出更多的异常
//    而重写的方法 不能比父类方法 抛出的异常多
    @Override
    public void run() {
        try {
//            休眠200秒
            Thread.sleep(200000);
        } catch (InterruptedException e) {
            //sleep interrupted 睡眠被中断
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName());
    }
}

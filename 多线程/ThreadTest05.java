package 多线程;

public class ThreadTest05 {
    /*
     * 获取当前线程对象
     *  static Thread currentThread() Thread类的静态方法 返回一个Thread
     * 获取线程对象的名字
     * getName()
     * 修改线程对象名字
     * setName()
     * */
    public static void main(String[] args) {
//        获取当前线程
        Thread t = Thread.currentThread();
//    输出名字
        System.out.println(t.getName());//main

        MyThread02 myThread02 = new MyThread02();
        Thread thread = new Thread(myThread02);
//        设置线程的名字
//        thread.setName("misaka");
//获取线程的名字
        String str = thread.getName();
        System.out.println("线程名字是 " + str); //线程名字是 misaka 默认值为Thread-0
        //        /启动
        thread.start();


        MyThread02 myThread03 = new MyThread02();
        Thread thread2 = new Thread(myThread03);
        System.out.println(thread2.getName()); //Thread-1
thread2.start();
//        所以 线程的默认名字的规律是 Thread-(线程总数-1)
    }
}

class MyThread02 implements Runnable {
    @Override
    public void run() {
        //        获取当前正在执行run方法的线程
        Thread t = Thread.currentThread();
//    输出名字
        System.out.println(t.getName());//Thread-0
        for (int i = 0; i < 100; i++) {
            System.out.println("分支线程->" + i + t.getName());
        }
    }
}

package 多线程;

public class Thread_Test09 {
    public static void main(String[] args) {
//        如何合理的关闭线程  通过打标布尔标记的方式


//        创建线程对象
        MyRunnalble04 myRunnalble04 = new MyRunnalble04();
        Thread thread = new Thread(myRunnalble04);
        thread.setName("misaka");
        thread.start();
//        五秒后关闭
        try {
            Thread.sleep(1000 * 5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        关闭 将标记更改为false
        System.out.println("关闭");
        myRunnalble04.isRun = false;
    }
}

class MyRunnalble04 implements Runnable {
    boolean isRun = true;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
//            循环for 每一次循环就判断是否终止
            if (isRun) {


                System.out.println(Thread.currentThread().getName() + "---->" + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
//        当isRun标记 为false 就终止线程运行
//                如何就可以再这里面 保存数据
                System.out.println(Thread.currentThread().getName() + "已终止运行");
                return;
            }

        }

    }
}
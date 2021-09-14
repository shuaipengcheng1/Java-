package 多线程;

import java.lang.Runnable;

public class Thread_Test03 {
    public static void main(String[] args) {
////        创建一个多线程对象
//Myrun r =new Myrun();
//封装为线程对象  并且传入一个实现了runnable接口的类
//Thread thread= new Thread(r);
//        2 使用匿名内部类
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                //     编写程序 这段程序运行在分支线程中
                for (int i = 0; i < 100000; i++) {
                    System.out.println("分支线程--->" + i);
                }
            }
        });
//创建线程
        thread.start();
        for (int i = 0; i <100000 ; i++) {
            System.out.println("主线程--->"+i);
        }
    }
}
//class Myrun implements Runnable {
//    @Override
//    public void run() {
////     编写程序 这段程序运行在分支线程中
//        for (int i = 0; i <100000 ; i++) {
//            System.out.println("分支线程--->"+i);
//        }
//    }
//}

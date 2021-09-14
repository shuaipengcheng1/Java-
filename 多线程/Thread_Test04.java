package 多线程;

import java.util.Scanner;

public class Thread_Test04 {
    public static void main(String[] args) {
        Stop stop =new Stop();
        Thread thread= new Thread(stop);
        thread.start();
//        阻塞事件
        Scanner scanner= new Scanner(System.in);
        scanner.nextInt(); //遇到阻塞事件 main方法自动释放当
//        前所占用的cpu执行权 给分支线程使用
        for (int i = 0; i <100 ; i++) {
            System.out.println("主线程->>>"+i);
        }
    }
}


class Stop implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <1000 ; i++) {
            System.out.println("分支线程->>>"+i);
        }
    }
}
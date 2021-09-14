package 多线程;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Re_定时器 {
    //    定时器复习
    public static void main(String[] args) throws Exception {
//    将定时器设为 守护线程
        Timer timer = new Timer();
//    创建开始时间
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        Date date = simpleDateFormat.parse("2021-07-29 13-17-10");
        // timer.schedule(每次执行的任务,第一次开始的时间,间隔(毫秒))
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
//            打印log
                try {
//                打印位置
                    System.setOut(new PrintStream(new FileOutputStream("logs",true)));
//                打印
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss ");
                    Date date1 = new Date();
                    String s = simpleDateFormat.format(date1);
                    System.out.println(s);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            }
        }, date, 1000);

//        因为守护线程 会在 所有的 主线程 结束时 自动结束 所以 执行一个睡眠十秒
//        Thread.sleep(10000);

    }
}

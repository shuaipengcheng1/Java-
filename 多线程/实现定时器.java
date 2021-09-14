package 多线程;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class 实现定时器 {
    /*
    * 使用定时器
    *
    * */
    public static void main(String[] args) throws Exception {
     //创建定时器 对象
        Timer timer= new Timer();
//        还可以设置为 守护线程 在参数中 传入布尔值
//        Timer timer1= new Timer(true);
//        还可以设置名字 和 守护线程
//        Timer timer1= new Timer("misaka",true);

        //        创建开始时间
        Date date = new Date();
        SimpleDateFormat simpleDateFormat= new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
//        将和格式一样的字符串 转为date对象
      date=  simpleDateFormat.parse("2021-07-28 18-40-50");


//       创建日志        (执行操作对象,第一次执行时间,间隔时间毫秒)
        timer.schedule(new logTimerTask(),date,1000*1);
//        也可以通过匿名内部类 来创建日志任务对象
//        timer.schedule(new TimerTask() {
//            @Override
//            public void run() {
//
//            }
//        },date,100*1);
    }
}

//定时器 执行的任务的类 记录日志的任务
class logTimerTask extends TimerTask {
//    TimeTask类 是一个抽象类
//    要实现run方法
    @Override
    public void run() {
//   往log文件中 打印日期
        try {
            System.out.println("开始打印");
//            输出到log文件中
            System.setOut(new PrintStream(new FileOutputStream("log",true)));
            Date date= new Date();
//            创建日期格式
            SimpleDateFormat simpleDateFormat= new SimpleDateFormat("yyyy-MM-dd HH-mm-ss SS");
//            将日期对象 转为 对应格式的字符串

            System.out.println(simpleDateFormat.format(date)+"\n");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
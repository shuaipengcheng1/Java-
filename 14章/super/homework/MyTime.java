package homework;

import java.util.Date;

public class MyTime {
    private int second;
    private  int hour;
    private int min;
    public  MyTime(){
        this.min = new Date().getMinutes();
        this.hour = new Date().getHours();
        this.second = new Date().getSeconds();

    }

    public static void main(String[] args) {
        MyTime m = new MyTime();
        System.out.println(m.hour+" : "+m.min+" : "+m.second);
    }
}

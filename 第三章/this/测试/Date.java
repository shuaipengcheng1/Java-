package 测试;

public class Date {
//    需求 如果传参 那么根据参数 如果无参 就自动修改日期为1970-1-1
    private int year;
    private  int month;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    private int day;

//    构造
    public Date(int year,int day,int month){
        this.year=year;
        this.day=day;
        this.month=month;
    }
//    方法重载
    public Date(){
//        this.year=1970;
//        this.day=1;
//        this.month=1;

//        第二种写法在这里面 调用另一个构造方法 而且不会参生新的实例对象  只是使用对方的构造体
//        语法
//          - this(形参)
//        前提：
//           - 必须方法名一致 也就是重载
this(1970,1,1);
    }

}

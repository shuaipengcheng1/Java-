package 测试;

public class test5_this {
//    创建日期
    Date d = new Date(2021,6,29);
//创建无参数
    Date d2 = new Date();
    public static void main(String[] args) {
        //        由于这里方法是类方法 所以要实例化类 来调用实例化变量
        test5_this tt=new test5_this();
 System.out.println(tt.d.getYear()+"-"+tt.d.getMonth()+"-"+tt.d.getDay());

 System.out.println(tt.d2.getYear()+"-"+tt.d2.getMonth()+"-"+tt.d2.getDay());

    }
}

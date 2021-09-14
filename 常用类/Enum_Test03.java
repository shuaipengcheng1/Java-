package 常用类;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Enum_Test03 {
//    四季
enum  Sesson{
    SPRING,SUMER,WINDOW,AUTOR;
}

    public static void main(String[] args) {
        //获取当前月份
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("MM");
      String m=  sdf.format(date);
       Sesson s = CheckSesson(Integer.parseInt(m));
//switch语句支持判断枚举 只需要在表达式中 传入一个枚举对象 下面就可以直接判断该枚举中的变量
      switch (s){
          case AUTOR : System.out.println("秋天");break;
          case SUMER:System.out.println("夏天");break;
          case WINDOW:System.out.println("冬天");break;
      }

    }
    public  static  Sesson CheckSesson( int m) {
if(m>3&&m<9){
    return Sesson.SUMER;
}
return Sesson.WINDOW;
    }
}


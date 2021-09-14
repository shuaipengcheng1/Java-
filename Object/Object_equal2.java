package Object;

import java.util.Objects;

public class Object_equal2 {
//    通过idea自动生成
public static void main(String[] args) {
    Mytime t =new time(1970,1,1);
    Mytime t2 =new time(197,1,1);
   boolean re= t.equals(t2);
   System.out.println(re);

}
}

interface  Mytime{
//boolean equals(Object obj); 这里不需要写也可以编译通过 因为类在一开始 会继承Object 然后object 中含有equals方法
}
class time implements  Mytime{


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        time time = (time) o;
        return day == time.day && mouth == time.mouth && year == time.year;
    }


    public time(int day, int mouth, int year) {
        this.day = day;
        this.mouth = mouth;
        this.year = year;
    }

    private int day;
    private int mouth;
    private int year;







    }


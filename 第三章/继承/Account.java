package 第三章.继承;

public class Account extends People{
//    用户实例 用户也是人 所以继承人的实例

    //    继承构造函数
    public  Account(String n,String g ,int a){
      super(n, g, a);
    }
}

package 抽象类;

public class 抽象类 {
//    Account a = new Account();  抽象类不能实例化 所以抽象类是用来给子类继承的（子类也可以是抽象类）
public static void main(String[] args) {
    save_card 小明 = new save_card("小明","66");
    System.out.println("这是"+小明.bank+"的"+小明.card_type+"用户为"+小明.Custom+"卡号为"+小明.CardCode);
}

}
//定义一个建设银行账户的抽象类
abstract class Account{
   String bank = "建设银行";

        }
//        定义一个储蓄卡类 继承建设银行
class save_card extends  Account{
    String card_type="储蓄卡";

    public save_card(String custom, String cardCode) {
        Custom = custom;
        CardCode = cardCode;
    }
    public  save_card(){

    }

    String Custom ;
    String CardCode;

}



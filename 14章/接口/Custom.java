package 接口;

public class Custom {


    public static void main(String[] args) {
        //使用 多态 来创建中餐的厨师对象
        Cooker c = new ChineseCooker();
      ChineseCooker china = (ChineseCooker)c;
      china.xihongshicaodan();
    }


}

//厨师的总接口   这种方法 在以后扩展厨师会更方便
interface Cooker{

}
//西餐
class AmericanCooker implements Cooker{
String type ="西餐";
}
//中餐
class ChineseCooker implements  Cooker{
String type="中餐";
void xihongshicaodan(){
    System.out.println("西红柿炒蛋");
}
}

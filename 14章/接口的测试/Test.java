package 接口的测试;

public class Test {
    public static void main(String[] args) {
        //    创建对应类型厨师的菜单
        Foodmenu c = new Amer();



//    创建用户
        Custome cc =new Custome(c);

//    点餐
        cc.order();
//
    }
}

package 接口的测试;

public class Custome {
    //    菜单
    private Foodmenu foodmenu;
public  Custome(Foodmenu f){
this.foodmenu= f;
}


//    点餐的动作
 public    void order(){
this.foodmenu.xihongshi();

    }
}

package 接口的测试;

interface Foodmenu {
    void xihongshi();
}
//中餐
class China implements  Foodmenu{
   public void xihongshi(){
        System.out.println("西红柿");
    };
}
class Amer implements  Foodmenu{
   public void xihongshi(){
        System.out.println("不会");
    }
    void niupai(){
        System.out.println("牛排");
    };
}



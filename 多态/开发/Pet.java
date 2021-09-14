package 多态.开发;

public class Pet {

    public Pet(Host h, String name) {
        this.h = h;
        this.name = name;
    }
    public Pet() {
    }
    Host h;
    String name;
    public void eat(Host h){
//        如果传入的主人对象 不是当前宠物的主人
        if(h==this.h){
            System.out.println("吃");
        }else {
//
            System.out.println("喂错了!");
        }

    }
}

package 接口.笔记本接口;

public class use_laptop {
    public static void main(String[] args) {


//        创建(购买) 一个鼠标
        Usb m  = new Mouse();
        //        创建一个笔记本
        LapTop l = new LapTop(m);
//        连接鼠标
        l.input();
        l.out();
    }
}

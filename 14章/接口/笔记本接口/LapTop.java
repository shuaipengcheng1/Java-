package 接口.笔记本接口;

public class LapTop {
    public LapTop(Usb mouse) {
        Mouse = mouse;
    }

    public LapTop() {
    }


    //    电脑拥有usb接口 has a 关系
    Usb Mouse;
//    连接的方法
    void input(){
        this.Mouse.input();
    }
    void out(){
        this.Mouse.out();
    }
}

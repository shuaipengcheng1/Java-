package 接口.笔记本接口;

public class Monitor implements Usb{
    private String name = "显示器";

    public void input(){
        System.out.println(name+"插入");
    }
    public void out(){
        System.out.println(name+"拔出");
    }
}

package 接口.笔记本接口;

public class Printer implements Usb{
    private String name = "打印机";

    public void input(){
        System.out.println(name+"插入");
    }
    public void out(){
        System.out.println(name+"拔出");
    }
}

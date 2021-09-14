package 多态.开发;

public class Test {


    public static void main(String[] args) {
        //    创建主人类
        Host h = new Host();
        Pet p =new Pet(h,"misaka");

        h.supply(p);
//        创建另一个
        Host x =new Host();
        x.supply(p);
    }
}

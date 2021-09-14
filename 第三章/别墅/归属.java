package 第三章.别墅;

public class 归属 {
    public static void main(String[] args) {
        //    实例化主人
        主人 master = new 主人("misaka",10);
//    实例化别墅
        房子 home = new 房子(130.3,master);
//输出别墅的主人
        System.out.println(home.person.name);
        master.getname("misaka");
    }

}

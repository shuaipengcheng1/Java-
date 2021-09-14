package 第三章.继承;

public class Test {

    public static void main(String[] args) {
        //    创建用户实例
        Account a =new Account("misaka","男",18);
//        使用继承的方法
        a.say();
        System.out.println("名字"+a.name+"性别"+a.gender+"年龄"+a.age);

    }
}

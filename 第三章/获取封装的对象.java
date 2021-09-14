package 第三章;

public class 获取封装的对象 {
    public static void main(String[] args) {
        对象的封装 user = new 对象的封装();
//        user.age;  //会报错 因为有private修饰符 声明为私有的属性

//        通过暴露出的方法 获取年龄
       int age= user.get_age();
       System.out.println(age);
//       通过暴露的方法 修改名字
        user.set_age(10);
        int age2= user.get_age();
        System.out.println(age2);
    }
}

package test;

import 类包.User;

public class Test02 {
    public static void main(String[] args) {

        User u =new User(100);
        u=new User(200); //修改了u的引用 指向了另一个对象 第一个对象也就成为了垃圾对象 垃圾处理器会自动销毁
        System.out.println(u.getId());
//        final修饰 实例化对象
      final   User user = new User(20);

//      报错 因为final修饰的变量 不能改变
//        user = new User(20);
        user.setId(50); //但是可以修改对象的id属性值 因为user的值是一个对象 确实不能修改因为有final 但是id属性值属于堆内存中的值 不会受到final的影响
    }


}

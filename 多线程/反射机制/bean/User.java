package 反射机制.bean;

public class User {
    public User() {
        System.out.println("无参数构造方法");
    }

    public User(int age) {
        this.age = age;
        System.out.println("有参数的构造方法");
    }

    int age;
}

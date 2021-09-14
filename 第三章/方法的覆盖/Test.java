package 第三章.方法的覆盖;

public class Test {
//    创建cat
    Cat c= new Cat();

//    创建dog
    Dog d =new Dog();

    public static void main(String[] args) {
        Test t = new Test();
        t.c.say();
        t.d.say();
    }
}

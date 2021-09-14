package 测试;

public class test2_this {
    int num =10;
static int num2 =20;
    public static void main(String[] args) {
//        System.out.println(num); 报错 因为这个方法是类方法(静态方法) 只能访问静态变量 而num 是实例化变量
        test2_this t = new test2_this();
        System.out.println(t.num);

//        如果想要直接访问 则要在变量前面加上static
        System.out.println(num2);
    }
}

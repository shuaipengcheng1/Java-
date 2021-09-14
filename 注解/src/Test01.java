public class Test01 {
    /*
     * 注解
     * 是一种引用数据类型
     * 自定义语法 [修饰符列表] @interface 注解类型名{}
     * */
//    @Test02(name="10") //报错因为没有夹Element,Field
    private int no;

    @Test02(name="10") //使用注解
    public static void m1() {
        System.out.println("m1");
    }
    @Test02(name="20")
    public void m2() {
        System.out.println("m2");
    }

    @Override //override方阿 修饰重写的方法 如果重写错误 编译阶段会报错
    public String toString() {
        return "Test01{" +
                "no=" + no +
                '}';
    }
}

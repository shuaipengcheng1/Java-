package 测试;

public class test1_static {
    public static void main(String[] args) {
//        创建一个中国人
        Chinese c = new Chinese("misaka",18,"男");
//        输出
        System.out.println(c.getName());
//        访问静态变量
System.out.println(Chinese.getCountry());
    }
}

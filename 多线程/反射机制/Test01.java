package 反射机制;

import 测试.Date;

public class Test01 {
    //    要操作字节码 首先要获取字节码文件
    // 获取方法
    public static void main(String[] args) throws Exception {
// 1  静态方法 Class.forName(类的字符串(完整的!!包含包名)) 返回一个Class类型对象
        Class c = Class.forName("java.lang.String");
// 2 java中任何一个对象 都有一个方法 getClass()
        String s = "";
        Class ss = s.getClass(); //这里获取的就是String 的 字节码

        System.out.println(c == ss); //true(==判断的内存的地址)

        Date date = new Date();
        Class cccc = date.getClass(); //获取date的字节码文件
        // 3 java中 任意一个数据类型 都有 .class 属性 保存 一个 Class
        Class stringClass = String.class;
        Class dateClass = Date.class;

    }
}

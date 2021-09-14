package 反射机制.bean;

import java.lang.reflect.Constructor;

public class Test {
    public static void main(String[] args) throws Exception {

        try {
            //        通过反射机制 获取class 通过class 来实例化对象
            Class c = Class.forName("反射机制.bean.User");
            Object obj = c.newInstance();
            System.out.println(obj); //反射机制.bean.User@16d3586
            //无参数构造方法 这个newInstance()方法 会调用指定对象的无参数构造方法 来创建对象
            //有参数构造 但是没有无参数构造 就会报错 无构造方法异常

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}

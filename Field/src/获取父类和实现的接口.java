public class 获取父类和实现的接口 {
    public static void main(String[] args) throws Exception {
//        String 举例
        Class c = Class.forName("java.lang.String");
//        获取string的父类
     Class cc=   c.getSuperclass();
     System.out.println(cc.getSimpleName()); //Object
//        获取接口 接口可以多个 所以为数组
     Class[] classes=   c.getInterfaces();
        for (Class item:classes
             ) {
            System.out.println(item.getSimpleName());
            /*
            * Serializable 可序列化
Comparable
CharSequence
            * */
        }
    }
}

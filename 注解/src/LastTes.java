import java.lang.reflect.Field;

public class LastTes {
    /*
     * 需求
     * 创建一个注解
     *  有该注解的对象都要 有一个int属性 否则报错
     * */
    public static void main(String[] args) throws Exception {
//        获取class
        Class c = Class.forName("User");
        Boolean isOk = false;

//        判断有该类的内部是否有id属性 in.class 获取class
        if (c.isAnnotationPresent(in.class)) {

//            如果有这个注解
            Field[] fields = c.getFields();
            for (Field item : fields
            ) {
//                判断是否有id属性
                if (item.getName().equals("id")) {
                    System.out.println("ok");
                    isOk = true;
                    break;
                }
            }
            if (!isOk) {

//                    报错
                error error = new error("使用in注解的类中要有id属性");
                error.printStackTrace();


            }
        }
    }
}

import java.lang.reflect.Constructor;

public class 反射构造函数 {
    public static void main(String[] args) throws Exception {
        /*
         *  反编译一个类的构造方法
         * */
//        获取
        Class<Bean> c = (Class<Bean>) Class.forName("Bean");
//        获取他的构造方法
        Constructor<Bean>[] constructor = (Constructor<Bean>[]) c.getConstructors();
// 遍历
        for (Constructor<Bean> item : constructor

        ) {
            System.out.println(item); /*
public Bean()
public Bean(int)
*/

        }
//        通过第二个构造函数public Bean(int)创建一个对象
        Bean obj = constructor[1].newInstance(10);
        System.out.println(obj.age); //10

    }
}

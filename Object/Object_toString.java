package Object;

public class Object_toString {
//    介绍toString() 方法
//    toString() 方法源码
//    public String toString(){
//    该代码意思为 类名@对象的内存地址转为十六进制的数值
//    return this.getClass().getName()+"@"+Integer.toHexString(hashCode())
//    }

//    目的是什么??
//    toString() 的作用是什么?
//    通过该方法可以将java的对象转为字符串的表示形式 sun公司建议所有的子类重写此方法 比如日期的类 toString后就输出日期
public static void main(String[] args) {

    Test t = new Test();
// String s=   t.toString();
//    就算是直接输出对象 底层也会调用该对象的toString方法
//    原因
//    public void println(Object x) {
//        String s = String.valueOf(x); //这行进行了转字符串 String.valueOf(Object obj) : 将 obj 对象转换成 字符串, 等于 obj.toString()
//        synchronized (this) {
//            print(s);
//            newLine();
//        }
//    }
 System.out.println(t); //重写前Object.Test@16d3586 重写后就是 misaka
}
}
class Test{
    String name = "misaka";
    int age=18;
    public  String toString(){
        return this.name+" 年龄为 "+this.age;
    }
}
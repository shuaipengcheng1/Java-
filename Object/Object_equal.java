package Object;

public class Object_equal {
//    equals()
//    源码
//public boolean equals(Object obj){
// return (this==obj);
// }

//    目的?>
//    通过equals判断两个对象是否相等 （ 在equals源码中 默认为使用"=="来判断对象是否相等 而双等号是依据变量的值 而对象的值是一个引用 所以必然返回的是false所以我们要进行重写）

    public static void main(String[] args) {
        test1 t1 = new test1();
        test2 t2 = new test2();
     boolean result=   t1.equals(t2);
 System.out.println(result); //重写前 false 重写后(通过toString判断) true
    }
}
class test1{
String name ="misaka";
    public String toString (){
        return this.name;
    }
    public boolean equals(Object obj){
        //
        return (this.toString()==obj.toString());
    }
}
class test2 {
    String name ="misaka";

    public String toString (){
        return this.name;
    }
public boolean equals(Object obj){
    return (this.toString()==obj.toString());
}
}

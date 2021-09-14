package 接口;
//继承 如果 与 实现 都存在 ?
public class test04 {
    public static void main(String[] args) {
        animal cat= new cat();
//        强转 调用子类的方法
        cat c = (cat)cat;
        c.fly();
    }



}

class   animal{
String type="动物";
}
//如果要继承 和 实现同时 代码如下
class cat extends animal implements fly{
    String type="猫";
public void fly(){
System.out.println(this.type);

}
}
//可以飞翔的
interface  fly{
void fly();
}

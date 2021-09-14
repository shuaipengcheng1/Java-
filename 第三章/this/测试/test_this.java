package 测试;

public class test_this {

public static void main(String[] args) {
    //    实例化一个客户类
    Custom c =new Custom("MISAKA",18,"男");
//    调用类上面定义的实例化方法
 c.buy();
  Custom c2 = new Custom("",18,"男");
  c2.buy();

//  调用类方法
    Custom.run();


}
}

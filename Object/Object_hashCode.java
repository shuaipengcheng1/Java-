package Object;
//hashCode方法 在object中的hashCode方法时怎样的？？
public class Object_hashCode {
//public native int hashCode();//该方法不是抽象方法 带有native关键字 底层会调用c++native是一个计算机函数，一个Native Method就是一个Java调用非Java代码的接口。方法的实现由非Java语言实现，比如C或C++。
//hashcode 方法 就是将一个java对象的地址 通过哈希算法 转为哈希值 所以hashCode的值 可以看作为java对象的地址
public static void main(String[] args) {
Object obj = new Object();
System.out.println(obj.hashCode()); //23934342
}
}



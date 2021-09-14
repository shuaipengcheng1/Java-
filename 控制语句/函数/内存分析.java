package 函数;

public class 内存分析 {
//    总结
//    java中也有堆栈内存
//    函数也是栈的解构 一层层嵌套 最下层是main函数 函数运行完后 出栈
    public static void main(String[] args) {
int a =10;
int b =20;
int re=intSum(a,b);
System.out.println(re);
    }
  public static int intSum(int a,int b){
        return  a+b;
    }
}

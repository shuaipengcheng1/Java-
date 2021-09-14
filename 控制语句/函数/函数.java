package 函数;

public class 函数 {
    public static void main(String[] args) {
       int re= Sum(10,20);
       System.out.println(re);
    }
//   [修饰符列表(以后再说为什么是public static)]  返回值类型  方法名(形参){
//   函数体
//    在java中 如果想要终止返回值为void的函数 使用return ;
//   }
    public static int Sum(int a,int b){

        return a+b;
    }
}



package homework;
import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        //    输入一个值 来猜值

        Scanner s  =new Scanner(System.in);
       int data= s.nextInt();

//       创建B
        B b = new B(data);
        b.test();

    }

}

class   A{
   double v=Math.floor(Math.random()*10);
    public A(int v){
        this.v=v;
    }
    public A(){

    }
}
class B extends  A{
    int data ;
    public  B(int data){
        this.data=data;
    }
    public void test(){
        if(this.data>super.v){
            System.out.println("大了");
            System.out.println("结果is"+super.v);
        }else if(this.data<super.v){
            System.out.println("小了");
            System.out.println("结果is"+super.v);

        }
        if(this.data==super.v){
            System.out.println("成功");
        }
    }
    public  B(){

    }

}

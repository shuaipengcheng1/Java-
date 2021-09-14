package homework;

import java.util.Scanner;

public class face_to_Object {
//    输入一个值来猜
public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
   int d= s.nextInt();
   R r = new R();
    Input i =new Input(r,d);
    i.test();


}
}
class R{
    double r = Math.floor(Math.random()*10);
   public R(){

   }

}
class Input{
    R r ;
    double data;
   public Input(R r,double data){
       this.r =r;
       this.data=data;
   }
   public void  test(){
      if( this.r.r == this.data){
          System.out.println("对");
      }
       if( this.r.r > this.data){
           System.out.println("小了");
           System.out.println(this.r.r);
       }
       if( this.r.r < this.data){
           System.out.println("大了");
           System.out.println(this.r.r);

       }
   }
}

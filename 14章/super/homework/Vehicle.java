package homework;

public class Vehicle {
    private double speed;
    private double size;
    public  void  move(){
        System.out.println("移动");
    }
    public void setSpeed(int speed){
        this.speed = speed;
        System.out.println("当前时速"+this.speed+"km/h");
    }
   public void   speedUp(){
        this.speed++;
       System.out.println("当前时速"+this.speed+"km/h");
   }
   public  void speedDown(){
       this.speed--;
       System.out.println("当前时速"+this.speed+"km/h");

   }

    public static void main(String[] args) {
//        实例化
        Vehicle v = new Vehicle();
        v.setSpeed(100);
        v.speedDown();
        v.speedUp();
    }
}

package Army;

public  class  Weapon {

    String name;
    String Type;
    public void Attack(){};
    public void move(){};

}
class M4 extends  Weapon{
    String name = "M4";
    String Type = "gun";
    public void Attack(){
        System.out.println("biu~");
    }
}

class Tank extends  Weapon{
    String name = "Tank";
    String Type = "Car";
    public void Attack(){
        System.out.println("Boom~");
    }
    public  void move(){
        System.out.println(this.name+" is moving ");
    }
}
class man extends  Weapon{
    String name = "Man";
    String Type = "Animal";
    public void Attack(){
        System.out.println("shoot");
    }
    public  void move(){
        System.out.println(this.name+" is moving ");
    }
}
package Army;

public class Test {
    public static void main(String[] args) {
        Army china = new Army();
        Weapon m4 = new M4();
//        向下转型
        M4 m = (M4) m4;
        Weapon tank = new Tank();
        System.out.println(m.name);

        Weapon man = new man();
        china.getWeapon();


//        扩容
        china.addLength(30);
 try {
     china.addWeapon(m);
     china.addWeapon(tank);
     china.addWeapon(tank);
     china.addWeapon(tank);
     china.addWeapon(tank);
     china.addWeapon(tank);
     china.addWeapon(man);
     china.addWeapon(man);
     china.addWeapon(man);       china.addWeapon(m);
     china.addWeapon(tank);
     china.addWeapon(tank);
     china.addWeapon(tank);
     china.addWeapon(tank);
     china.addWeapon(tank);
     china.addWeapon(man);
     china.addWeapon(man);
     china.addWeapon(man);       china.addWeapon(m);
     china.addWeapon(tank);
     china.addWeapon(tank);
     china.addWeapon(tank);
     china.addWeapon(tank);
     china.addWeapon(tank);
     china.addWeapon(man);
     china.addWeapon(man);
     china.addWeapon(man);       china.addWeapon(m);
     china.addWeapon(tank);
     china.addWeapon(tank);
     china.addWeapon(tank);
     china.addWeapon(tank);
     china.addWeapon(tank);
     china.addWeapon(man);
     china.addWeapon(man);
     china.addWeapon(man);
 }catch (Error e){
    e.printStackTrace(); //请扩容!!!!
 }


        china.all();
        china.move();
        china.getWeapon();

    }
}

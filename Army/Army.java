package Army;

import 异常.Error_Test2;

import java.util.Arrays;

public class Army {
//    军队类

    //    默认武器数量
    private int Max_Weapon = 10;
    private Weapon[] weapon = new Weapon[Max_Weapon];

    public void addWeapon(Weapon w) throws Error {
        for (int i = 0; i < weapon.length; i++) {
            if (weapon[i] == null) {


                if(w instanceof M4){

                    M4 m  = (M4)w;
                    weapon[i] = m;
                    System.out.println("添加成功"+m.name);

                }

                if(w instanceof Tank){

                    Tank m  = (Tank)w;
                    weapon[i] = m;
                    System.out.println("添加成功"+m.name);
                }
                if(w instanceof man ){
                    man m  = (man)w;
                    weapon[i] = m;
                    System.out.println("添加成功"+m.name);
                }
                break;
            }
            if (i == weapon.length - 1) {
                throw new Error("请扩容");
            }
        }
    }

    public void all(){
        for (int i = 0; i < weapon.length-1 ; i++) {
            if(this.weapon[i]!=null){
                this.weapon[i].Attack();
            }

        }
    }
    public void move(){
        for (int i = 0; i <weapon.length ; i++) {
            if(weapon[i]!=null){
          weapon[i].move();
            }
        }
    }

    public  void addLength(int num){
        Weapon[] arr = new Weapon[num];
//        传入作为扩容的数组
         System.arraycopy(weapon,0,arr,0,weapon.length);
//         覆盖
        this.weapon = arr;
System.out.println("扩容成功");


    }

    public  void getWeapon(){
        int x =0;
        int m4=0;
        int tan =0;
        int ma =0;
        for (int i = 0; i <this.weapon.length ; i++) {

            if(this.weapon[i]!=null){
                if(this.weapon[i] instanceof  M4){
                    M4  m= (M4) this.weapon[i];
                    System.out.println(m.name);
                    m4++;
                }
                if(this.weapon[i] instanceof  Tank){
                    Tank  m= (Tank) this.weapon[i];
                    System.out.println(m.name);
                    tan++;
                }
                if(this.weapon[i] instanceof  man){
                   man m= (man) this.weapon[i];
                    System.out.println(m.name);
                   ma++;
                }
                x++;

            }

        }
        System.out.println("武器总数为  "+x+"  tank "+tan+"  m4  "+m4+"  man  "+ma);
    }



}

package 第三章.别墅;

public class 主人 {
 String name ;
 int id;
 public void getname(String name){
     System.out.println("我叫"+name);
 }
// 实例化
    public 主人(String n , int i){
     this.name = n;
     this.id = i;
     this.getname("");
    }
}

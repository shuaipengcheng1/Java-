package 第三章.继承;

public class People {
//    人的实例
    String name;
    int age;
    String gender;
    public void say(){
        System.out.println(this.name+"在说话");
    }
    //    构造函数
    public  People(String n,String g ,int a){
        this.name =n;
        this.gender=g;
        this.age=a;
    }

}

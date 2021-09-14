package homework;

public class Human {
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private  String name;
    private  int age;
    public  void display(){
        System.out.println("name"+this.name+"age"+this.age);
    }
    public  static  void type(){
        System.out.println("人类");
    }

    public static void main(String[] args) {
        Human h = new Human("misaka",18);
        h.display();
        Human.type();
    }
}

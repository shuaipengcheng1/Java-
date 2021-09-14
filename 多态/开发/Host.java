package 多态.开发;

public class Host {


    Pet p;
    String name;

    public void supply(Pet p){
       p.eat(this);
    }
}

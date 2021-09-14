package 接口的测试2;

public class misaka implements Student{
   private String name = "misaka";
   private int age = 18;

    @Override
    public int get_age() {
     return  this.age;
    }

    public String get_name() {
        return name;
    }
}

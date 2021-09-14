package 集合;

/*
* 自定义泛型 <任意>
* */
public class 自定义泛型<T> {
    public static void main(String[] args) {

//        在类上的自定义泛型 在new的时候 声明泛型
        自定义泛型<String> x = new 自定义泛型<>();
        x.dosome("xx");
        自定义泛型<Integer> f= new 自定义泛型<>();
        f.dosome(10);
    }
    public   void dosome(T o){
        System.out.println(o);
    }
}

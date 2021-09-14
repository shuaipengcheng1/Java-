package 数组;

import test.A;

//引用数据类型数组
public class Array_obj {

    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal a2 = new Animal();
//        多态
        Animal a3 = new Cat();
        Animal[] arr = {a1,a2,a3};
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
            arr[i].move();
            if(arr[i] instanceof  Cat){
//                向下转型
                ((Cat) arr[i]).Miao();
            }
        }
    }
}
class Animal{
    public void move(){
        System.out.println("move");
    }
}
class Cat extends  Animal{
    public void move(){
        System.out.println("猫猫");
    }
    public  void Miao(){
        System.out.println("喵喵~");
    }
}
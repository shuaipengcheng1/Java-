package 集合;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class 泛型 {
    //    jdk5.0 之后的新特性
    public static void main(String[] args) {

//    ------------------------不是泛型
//    List list = new ArrayList();
//    Animal animal = new Cat();
//    Animal animal1 = new Brid();
//
//    list.add(animal);
//    list.add(animal1);
////    遍历集合 使用方法
//    Iterator it = list.iterator();
//    while (it.hasNext()){
////        不是用泛型 只能强转
//        Object obj =it.next();
//        if(obj instanceof  Cat){
//            Cat c = (Cat) obj;
//            c.CatchMouse();
//        }
//        if(obj instanceof  Brid){
//           Brid c = ( Brid)obj;
//            c.fly();
//        }
//    }


//    ----------------------------------使用泛型
//    泛型 可以统一集合中的数据类型
        List<Animal> list = new ArrayList<Animal>(); //这一行 意思为该集合只能 存储Animal类型的对象数据 这样数据类型更加统一
        list.add(new Cat());
        //    list.add("12"); 报错
        list.add(new Brid());

//    获取迭代器 也是用泛型
        Iterator<Animal> it = list.iterator();
        while (it.hasNext()) {
            Object obj = it.next();
            it.next().move(); //直接move  使用泛型后 对象一定是泛型指定的类型
            if (obj instanceof Cat) {
                ((Cat) obj).CatchMouse();
            }
        }


    }

}

class Animal {
    public void move() {
        System.out.println("动物在移动");
    }
}

class Cat extends Animal {
    public void CatchMouse() {
        System.out.println("抓老鼠");
    }
}

class Brid extends Animal {
    public void fly() {
        System.out.println("飞");
    }
}

package 多态;

public class test {
    public static void main(String[] args) {
        //以前语法的程序
        brid b =new brid();
        b.move();
        Cat c = new Cat();
        c.move();
//使用多态语法
//        Cat is a Animal
//        Animal 和 Cat 有继承关系 Animal是父 Cat是子
//        new Cat(); 创建的对象的类型是Cat 而 a2 是animal 可见他们进行了类型转换
//        子类型转父类型 称为向上转型 自动类型转换
//        java允许这种语法 父类型引用(实例化对象)指向子类型对象
        Animal a2 =new Cat();
        a2.move();
//        如果想要a2使用cat的catchMouse方法 怎么办
//        向下转型 并且也必须要有继承关系 强制类型转换

//        将a2强制转换为Cat并且赋值给c2
        Cat c2 = (Cat) a2;
        c2.catchMouse();
//创建一个a3 这里用到了向上转化
     Animal a3 = new brid();
//     这里不会报错 因为Cat确实是Animal的子类 语法是正确的 但是该引用最后还是会指向brid 所以调用cat的方法时 会报错（类型转换异常）
//        怎么避免出现(类型转换异常)
//        使用instanceof
//         1-语法 与js一致
//        引用 ins.. 数据类型
//        if(a3 instanceof brid) 改代码意思为 a3 是否指向的对象是 brid
        if(a3 instanceof brid){
            brid b3 = (brid) a3;
            b3.move();
        }

    }

}

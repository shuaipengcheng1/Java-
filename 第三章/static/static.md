## static （静态）


## 静态代码块
 可以使用static来创建一个static代码块
  1语法
   static{
java语句; 
}
  2 代码块在类加载时指向 并且只执行一次
 
  3 并且可以写多个 从上到下 执行

  4 作用?
   类似于生命周期的mounted(){} or componentDidmount(){}  一般在static块中 写初始化相关的代码 和前端的发送ajax之类的很像

public class test2_static {
//    静态代码块
static {
System.out.println("静态代码");
}
static {
System.out.println("静态代码2");
}

    public static void main(String[] args) {
        System.out.println("main");
    }
}


## 实例代码块
1 语法
{
java语句;
}

2 执行时间
在类被实例化的时候执行
//        执行实例代码块
实例代码块 s=  new 实例代码块();

3 也可以写多个 从上至下执行


## 总结
public 是公开的 任何地方都是可以访问的
static 标识静态的 可以通过 类. 的方式访问
void 表示 不返回值任何值、
(String[] args) 表示main方法的形参列表
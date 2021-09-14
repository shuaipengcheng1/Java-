## 先通过javac 编译文件 并且生成class文件

## 2 通过java 文件名(无后缀) 来运行


## java的注释
1 单行//
2 多行 /**/
3 doc注释 /** 
 *
 *
 *
 * doc注释如果通过javadoc编译 就会被编译
        */


## helloworld 代码解析

public class helloworld 就表示定义一个公开的类 叫helloworld
<!-- public 公开的 -->
<!-- class 标识一个类 -->
<!-- helloworld 标识类名 -->


public class helloworld{

<!-- java语句必须用;结尾 呜呜呜我的js -->
<!-- java字符串必须用"" jswww -->

<!-- 类体 类体中不能直接写java语句 变量除外 -->

<!-- public 公开 -->
<!-- static 静态 -->
<!-- void 空(返回值?) -->
<!-- main 表示方法名(函数?)为main -->
<!-- String[] args
是main方法的形式参数列表 -->
 <!-- public static void main(String[] args) 表示一个公开的静态的方法(程序的入口,主方法) -->
    public static void main(String[] args){ //

    <!-- 方法体 -->

    <!-- 该方法的作用是 向控制台输出一行字符串 -->
        System.out.println("hello world");
    }

      // 也能输出变量
        System.out.println(a);

}

## public class 和 class 的区别
一个java文件跨域定义多个class
一个java文件当中不一定有public的class

一个java文件中public的class不是必须的！

一个class会定义生成一个 xxx.class 文件 多个class会生成多个class文件 

如果在文件中定义了public class xxx{} 那么文件名也必须是xxx
而 class 就不需要  并且一个java文件的public class 只能有一个 


并且每一个class 中都必须要有一个main函数

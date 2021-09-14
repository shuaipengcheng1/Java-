package 多线程;
/*
* 编写一个类 直接继承 Thread类 并重写run方法
* */
public class Thread_Test02 {
    public static void main(String[] args) {
//main方法自主栈中运行
//        新建一个分支线程对象 也就是继承类的类
        MyThread myThread =new MyThread();
        //        myThread.start(); 启动线程 在jvm中开辟一个新的栈空间 这段代码瞬间结束
//        启动成功的线程 会自动调用run方法 并且run方法在分支栈的栈底部(相当于分支栈的main)
//如果直接调用在main方法中调用run 方法 那么就不是多线程 因为没有开辟新的栈空间 只是压了一个栈在main中
        myThread.start();
//        这里的代码还是运在主线程中
        for (int i = 0; i <100000 ; i++) {
            System.out.println("主线程--->"+i);
        }

        /*
        * 主线程--->0
分支线程--->0
分支线程--->1
分支线程--->2
分支线程--->3
分支线程--->4
分支线程--->5
分支线程--->6
分支线程--->7
分支线程--->8
分支线程--->9
分支线程--->10
分支线程--->11
分支线程--->12
分支线程--->13
分支线程--->14
分支线程--->15
分支线程--->16
主线程--->1
分支线程--->17
* ......
* 从运行结果可以看出 分支线程 和 主线程 是并发运行的
        *
        * */

    }
}
class MyThread extends Thread{
    @Override
//    重写run
    public void run() {
//     编写程序 这段程序运行在分支线程中
        for (int i = 0; i <100000 ; i++) {
            System.out.println("分支线程--->"+i);
        }
    }
}


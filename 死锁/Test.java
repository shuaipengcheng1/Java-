package 死锁;

public class Test {
//    死锁 指锁的使用起了冲突 两个线程“逆向运行“先后互相调用对方即将要使用的方法 从而一直阻塞 程序无法继续运行

    public static void main(String[] args) {
        //    创建两个线程公用一个类 一个 线程先锁用户名字 再锁 年龄 另一个反之
        Mytest mytest = new Mytest("18", "miskaa");
        Thread thread = new Thread(new MyThread(mytest));

        Thread thread1 = new Thread(new MyThread(mytest));
        thread.setName("1");
        thread1.setName("2");

        thread.start();
        thread1.start();
    }


}

//线程类
class MyThread implements Runnable {
    public MyThread(Mytest mytest) {
        this.mytest = mytest;
    }

    private Mytest mytest;

    @Override
    public void run() {
if(Thread.currentThread().getName().equals("1")){

    mytest.changeAge(); //t1 进入changeAge方法 锁住了age






}
        if(Thread.currentThread().getName().equals("2")){
            mytest.changeName(); // t2 进入changeName方法 锁住了Name




        }
    }
}

//类
class Mytest {
    public String age;

    public Mytest(String age, String name) {
        this.age = age;
        this.name = name;
    }

    public String name;

    //    修改名字
    public void changeName() {
//        同步代码块 锁名字
        synchronized (this.name) {
System.out.println(Thread.currentThread().getName());
            //创建死锁条件 t2线程进入后 睡眠(占用)十秒 让t1线程拿不到进来的锁
            if(Thread.currentThread().getName().equals("2")){
                this.changeAge(); //t2 进来之后 想调用changeAge 但是发现进不去 因为t1也正在占用 就等待t1方法结束归还锁（t1又在等t2）  所以无法结束该方法 就一直阻塞
            }
        }
    }

    //    修改年龄
    public void changeAge() {
        synchronized (this.age) {
            System.out.println("age"+Thread.currentThread().getName());

            if(Thread.currentThread().getName().equals("1")){
           this.changeName();//t1 进来之后 想调用changeName 但是发现进不去 因为t2也正在占用 就等待t2方法结束归还锁(t2也在等t1)  所以无法结束该方法 就一直阻塞
            }

        }
    }

}

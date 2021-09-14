package 模拟多线程并发;

public class Test {
//    创建两个账户线程 模拟同时取钱(线程并发问题 3要素 1并发 2数据共享 3数据修改) 观察问题
public static void main(String[] args) {
    Cutmer cutmer = new Cutmer("张三");
    Cutmer cutmer1 = new Cutmer("李四");
//    新建状态
    Thread  thread = new Thread(cutmer);
    Thread thread1 =new Thread(cutmer1);

//    开始运行 两个都会执行取钱操作
    thread.start();
    thread1.start();

    //输出两个的钱
    try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }


System.out.println(cutmer.Mouny);
    System.out.println(cutmer1.Mouny);

}
}

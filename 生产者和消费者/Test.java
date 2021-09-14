package 生产者和消费者;

import java.util.*;

/*
* __什么是生产者和消费者模式__?
- 一个线程负责生产
- 一个线程负责消费
- 最终要达到生产和消费必须均衡:
例如:
    生产满了 就不能继续生产了,
    必须让消费线程进行消费.
    消费完了,就不能再消费了,
    必须让生产线程进行生产
    *
    *
    * *********
    * 需求‘
    * 厂库使用list集合
    * 仓库只能最多存储一个元素
    * 1个元素就满了(暂停生产者线程 运行消费线程)
    * 0个就是空(运行生产者 暂停消费者)
    * 保证list集合永远最多只有 一个元素
    *
    * 生产一个 消费一个
* */
public class Test {
    public static void main(String[] args) {
//        仓库
        List<Integer> Cage = new ArrayList<>();
//        两个线程
        Producer producer = new Producer(Cage);
        Customer customer = new Customer(Cage);
        producer.start();
        customer.start();
//        每隔4s 监视厂库
        Timer timer = new Timer(true);
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Iterator<Integer> i = Cage.iterator();
                while (i.hasNext()) {

                    System.out.println("仓库当前元素" + i.next() + "\n");
                }
            }
        }, new Date(), 4000);
    }
}

//生产者线程
class Producer extends Thread {
    List<Integer> cage;

    public Producer(List<Integer> cage) {
        this.cage = cage;
    }

    @Override
    public void run() {
        System.out.println("1");
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                synchronized (cage) {//锁住仓库 因为仓库对象 是 两个线程 共同的对象 并且为实例变量 还会修改 所以有 线程安全问题
                    //      一直往cage里面添加元素
                    if (cage.size() < 1) {
                        //            唤醒当前线程 不会释放当前的锁
                        cage.notify();
                        System.out.println("生产者开始生产");
                        cage.add(1);
                    } else if (cage.size() > 1) {
                        try {
                            System.out.println("生产者暂停");
                            cage.wait(); //暂停当前线程 并且释放当前线程共同对象的对象锁
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }, new Date(), 3000);

    }
}

//消费者线程
class Customer extends Thread {
    List cage;

    public Customer(List cage) {
        this.cage = cage;
    }

    @Override
    public void run() {
        System.out.println("2");
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                synchronized (cage) { //同步锁
                    //        一直消费
                    if (cage.size() == 1) {
//            唤醒当前线程
                        cage.notify();
                        System.out.println("消费者开始运行");
                        int index = cage.size(); //获取最顶部的下标
                        cage.remove(index - 1);

                    } else if (cage.size() == 0) {
                        try {
                            System.out.println("消费者暂停");
                            cage.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }

            }
        }, new Date(), 3000);
    }
}

package 多线程;

import java.util.ArrayList;
import java.util.List;

public class 交替输出 {
    public static void main(String[] args) {
//        通过wait 和 notify() 来控制两条 线程
        List list = new ArrayList();
        T1 t1 = new T1(list);
        T2 t2 = new T2(list);
        t1.start();
        t2.start();

    }
}

class T1 extends Thread {
    public T1(List l) {
        this.l = l;
    }

    List l;

    @Override
    public void run() {
        while (true) {
            synchronized (l) { //对象锁 为 线程共享对象l
                if (l.size() == 1) {
                    l.notify(); //唤醒l对象的线程 不释放锁
                    System.out.println("T1删除元素");
                    l.remove(l.size() - 1);
                } else if (l.size() == 0) {
                    try {
                        l.wait(); //暂停当前线程 并且释放掉抢到的锁 给其他线程
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

    }
}

class T2 extends Thread {
    public T2(List l) {
        this.l = l;
    }

    List l;

    @Override
    public void run() {
        while (true) {
            synchronized (l) {
                if (l.size() == 0) {
                    l.notify();
                    System.out.println("L2添加元素");
                    l.add(new Object());
                } else if (l.size() > 0) {
                    try {
                        l.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}

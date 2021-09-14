package 多线程;

public class SLEEP_面试 {
    public static void main(String[] args) {
        Thread tx = new t();
        tx.setName("t");
        tx.start();

        try {
            Thread.sleep(2000); //是否会停止 t线程的运行 不会 sleep停止的是当前线程 也就是main
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
System.out.println("hello world");
    }
}
class t extends  Thread{
    @Override
    public void run() {
        for (int i = 0; i <100000 ; i++) {
            System.out.println("分支->"+i);
        }
    }
}

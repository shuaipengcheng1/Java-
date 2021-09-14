package 多线程;

public class 守护线程 {
    /*
    * 实现一个守护线程
    * */
    public static void main(String[] args) {
        BakThread bakThread = new BakThread(); //将该线程 设置为守护线程 在用户线程结束时 该线程也结束
      bakThread.setDaemon(true); //设置为守护线程
        bakThread.setName("备份数据的线程");
        bakThread.start();

        for (int i = 0; i <10 ; i++) {
            System.out.println("main-->"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
//一个备份数据的线程
class BakThread extends  Thread{
    @Override
    public void run() {
//        定义局部变量
          int i =10;
//          死循环
        while (true){
            System.out.println(Thread.currentThread().getName()+"---->"+(i++)+"已备份!");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

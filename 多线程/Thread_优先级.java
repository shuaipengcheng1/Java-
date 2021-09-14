package 多线程;

public class Thread_优先级 {
    public static void main(String[] args) {
        Test_x test_x = new Test_x();
//       设置优先级 最高10
        test_x.setPriority(8);
//        main函数优先级不变 为默认值5
        System.out.println("main的优先级"+Thread.currentThread().getPriority());//main的优先级5
        test_x.start();
        for (int i = 0; i <100 ; i++) {
            System.out.println("main-->"+i);
        }
/*
* 通过查看结果 分支函数(优先级高的) 大概率运行次数更多/更早
* */
    }
}
class Test_x extends  Thread{
    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            System.out.println("分支函数"+i);
        }
    }
}

package 多线程;

public class Thread_yield {
//    线程让位 静态方法 yield() 释放当前线程的cpu执行权 回到就绪状态 让给其他线程
    // 注意! 即使让了位 也有可能下一次还是该线程抢夺了cpu执行权
    // 所以 没有优先级的那么明显


    public static void main(String[] args) {

        Test_y test_y= new Test_y();

        test_y.start();


        for (int i = 0; i <1000 ; i++) {
            //      每一百次循环   当前线程让位
            if(i%100==0){
                Thread.yield();
            }
/*
*
* MAIN-->99
 分支函数-->34 (第一次 让位成功)
 *
 *  看来了 一下 不是十分明显
 * MAIN-->399
分支函数-->402
* */
            System.out.println("MAIN-->"+i);
        }

    }

}
class Test_y extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <1000 ; i++) {
            System.out.println("分支函数-->"+i);
        }
    }
}

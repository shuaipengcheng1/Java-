package 解决多线程安全问题;

public class Cutmer implements Runnable {
    @Override
    public void run() {
//        取款
        Get_qian(new ATM());

    }

    public Cutmer(String name,String card) {
        this.name = name;
        this.card=card;
    }

    private void Get_qian(ATM atm) {
//        取钱的动作
//        取一万
//        也可以在这里使用卡号作为对象锁 来限制同样卡号的用户同时取钱（字符串内容相同时 地址相同 都在同一个字符串常量池变量中 由于地址相同 所以是唯一的且不会改变并且满足了两个线程共享该数据 所以可以作为共享对象锁）  将其变为排队执行
//        比如 652324 正在取钱 那么652324字符串对象的地址 就被锁住 如果有第二个652324取钱 则 等待第一个取完(排队执行) 反之 352324取钱 不与652324发生冲突 则异步执行(并发执行)
        synchronized (card){
            atm.get(this.card, 10000, name,this,obj);
        }

    }

    private String name;
    private String card = ""; //卡号
    public int Mouny = 0; //余额
    public Object obj=new Object();

}

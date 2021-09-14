package 模拟多线程并发;

public class Cutmer implements Runnable {
    @Override
    public void run() {
//        取款
        Get_qian(new ATM());

    }

    public Cutmer(String name) {
        this.name = name;
    }

    private void Get_qian(ATM atm) {
//        取钱的动作
//        取一万
        atm.get(this.card, 10000, name,this);
    }

    private String name;
    private int card = 652324; //卡号
    public int Mouny = 0; //余额

}

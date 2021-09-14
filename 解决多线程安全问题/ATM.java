package 解决多线程安全问题;

//继承了银行
public class ATM extends Bank {

int a=10;
    //    取钱方法
    @Override
//    接收卡号
    void  get(String card_id, int get_value, String name, Cutmer cutmer,Object obj) {
//        解决线程安全 必须让该方法为线程排队 而不是线程并发 使用        synchronized () 表示这段代码采用线程排队机制
//                synchronized (这里传入线程并发时 想要实现线程排队的线程的共同的数据){线程同步代码块} 线程同步代码块(线程)执行完 另一个线程才能进来
//这里共享的是 银行卡里的钱 或者是银行对象的任意唯一对象 甚至是银行的名字对象(因为名字对象也是唯一且不变)
        //还可以直接放一个"xxx" 字符串 因为字符串 都存储在字符串常量池 且地址不会改变 只不过这样写的话所有的线程都会同步执行 而不会并发
//卡号一致的 等待 不一样的不等待 这里利用了字符串的特性 只有内容一致 地址就相同 因为都在字符串常量池中(两个相同的 另一个拿锁的下一个就会等待因为字符串的地址已经被占用了 而没有重复的就直接异步执行)
//        例如 "652324"的地址 只有在字符串常量池创建 就不会变化
//        synchronized (card_id){
            //读取数据库
            int value= map.get(card_id);
//       取出指定的金额 如果剩余大于取出
            if(get_value<=value){


//            将钱给对应的人
                cutmer.Mouny=value;
                map.put(card_id,value-get_value); //key相同value覆盖
                System.out.println("取出成功 "+name+ "卡号为 "+ card_id+ "的余额为 "+map.get(card_id));
            }else {
                System.out.println(name+"取出失败 余额不足 余额为 "+value+"目标金额为 "+get_value+"卡号为 "+card_id);

            }
//        }

    }
}

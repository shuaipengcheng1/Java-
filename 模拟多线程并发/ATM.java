package 模拟多线程并发;
//继承了银行
public class ATM extends  Bank{
//    取钱方法

    @Override
//    接收卡号
//    现在有 线程安全问题
    void get(int card_id,int get_value,String name,Cutmer cutmer) {
//读取数据库
       int value= map.get(card_id);
//       取出指定的金额 如果剩余大于取出
        if(get_value<=value){


//            将钱给对应的人
            cutmer.Mouny=value;
            map.put(card_id,value-get_value); //key相同value覆盖
            System.out.println("取出成功 "+name+ "余额为 "+value);
        }else {
            System.out.println(name+"取出失败 余额不足 余额为 "+value+"目标金额为 "+get_value);

        }
    }
}

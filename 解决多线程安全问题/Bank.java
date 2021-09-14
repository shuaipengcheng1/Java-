package 解决多线程安全问题;

import java.util.Map;
import java.util.TreeMap;

public abstract class Bank {
    public int cardId;
   public  String name = "建设银行";
    public static Map<String, Integer> map;

    static {
//    静态代码块 在类实例化时运行 模拟从数据库中取值
//    创建一个treemap
        TreeMap<String, Integer> treeMap = new TreeMap<>();
//    添加key value key为卡号 value为卡中的钱
        treeMap.put("652324", 10000); //652324中 有10000
        treeMap.put("352324", 10000); //352324中 有10000

        map=treeMap;
    }

    //抽像方法
    abstract void get(String cardId, int get_value, String name, Cutmer cutmer,Object o);

}

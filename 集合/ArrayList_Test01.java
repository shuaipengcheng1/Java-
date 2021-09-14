package 集合;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayList_Test01 {
    public static void main(String[] args) {
        /*
         * List接口 实现类之一 ArrayList 底层为数组 有序 有下标
         * ArrayList 底层中 默认长度为10(在构造时长度为0 当第一次调用add() 方法后 系统初始话长度为10)并且为一个Object[]
         * ArrayList 的构造方法 有一个有参的 参数传一个int型 来定义长度
         *size() 方法是获取的当前集合的元素个数
         *————————————————————————————————————
         *    ArrayList集合的扩容
         *    1 如果超过了 集合的默认长度10
         *    2 底层就会 运行如下代码
         *      新长度= 老长度 + 老长度 >> 1  也就是增长1.5倍
         *    >>  右位移
         *   原理 (位运算 先将值转为2进制)
         *    4(int类型) 转为 00000100
         *    然后右移 1 位 为 00000010 为 2
         *    最后 4+2 得到新的长度 6
         *    也就是增加了 原长度的1.5倍(6/4)
         * ————————————————————————————————————
         *    尽可能少点的扩容 因为数组扩容效率较低
         *    所以在初始化时 尽量预估
         *    尽可能添加元素 使用add 因为ArrayList的数据结构是数组 从末尾添加 不影响性能
         *  -----------
         *  面试题
         *   什么集合用得最多?
         *   ArrayList
         *
         * ————————————————————————————————————————
         *            优缺点
         *  优点
         *   因为是数组 所以 检索效率高 (内存空间是连续的)
         *  缺点
         *  随机增删效果不好
         *
         *
         * ---------------------
         * 如何将数组集合转为线程安全的
         *    Collections.synchronizedList(list);
         * */

        List list = new ArrayList();// 无参数 默认长度 为10

        System.out.println(list.size()); //0

        List list1 = new ArrayList(20); //有参数 自定义长度
        System.out.println(list.size()); //0

    }
}

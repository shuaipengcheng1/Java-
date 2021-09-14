package 集合;

public class Node {
    /*
    * 链表中的节点
    * 节点是单向链表中基本的单元
    * 每一个节点 都有两个属性
    * 一个属性 :存储数据
    * 第二个 ： 存储下一个节点的内存地址
    * */
    Object elementData; //存储的数据
    Node next;
    public Node(){

    }
    public Node(Object elementData,Node next){
        this.elementData =elementData;
        this.next = next;
    }

    public Node next() {
        return next;
    }
}

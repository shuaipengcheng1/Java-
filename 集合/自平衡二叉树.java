package 集合;

public class 自平衡二叉树 {
//    自平衡二叉树 是HashMap/HashSet的底层数据结构
//    根节点 Head_Node
//    比较规则 (假设x为根节点) x-y ==0 相等  x-y>0  x大(y的节点为x的右子树节点上)    x-y<0 x小(y在x的左子树节点上)
//    右子树节点 (比根节点更大的) 类名 Rigth_Node
//    左子树节点(比根节点更小的)   Left_Node
//    每一个节点的对象属性
//    T Key (键), T Value (值), T Rigth(该节点的右节点指针),  T Left (该节点的左节点指针),

//    取出判断 如果一个节点 在被取出时 该节点拥有完整的树状结构 那么将该节点视为一个单独的树 进行取值
//     如果不是一个完整的树 那么依照 中序遍历的规则 左根右   比如没有左 那么就是根右   没有右就是根左 根必须存在!!!

}

// 树节点类
 class Tree_Node{
     public Tree_Node(Object key, Object value) {
         Key = key;
         this.value = value;
     }

     //头节点
Object Key;
Object value;
Object Rigth_Node;
Object Left_Tree;
}


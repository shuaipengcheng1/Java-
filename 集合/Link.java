package 集合;

/*
 * 链表优点
 * 随机增删效率高
 * 缺点
 * 查询效率低 因为要从开头节点一个一个的next
 * */
public class Link {
    //    头节点
    private Node header = null;
    //容量
    private int size = 0;
    //    下标
    private int index = 0;
    private Node save = null;
    private int Set_index = 0;
    private Node Set_save = null;

    //向链表中 添加元数的方法
    public void add(Object obj) {
//创建一个新的节点对象
        if (header == null || (header.next == null && header.elementData == null)) {
//           头节点为空 说明还没有节点
//           这时的头节点 既是头节点 也是末尾节点
//            System.out.println("成功");
            header = new Node(obj, null);
            Set_save = header;
        } else {
//           说明已经有头节点了
//           找出当前的末尾
            Node currentLast = findLast();
//           把当前的末尾检点的next赋值为当前节点
            if (currentLast != null) {
                currentLast.next = new Node(obj, null);
            }

//            System.out.println("尾部成功");

        }
//        将之前的节点地址 指向 新添加的节点对象

    }

    //    删除
    public boolean remove(Object obj) {
        return remove_loop(this.header, obj);
    }

    //    修改
    public void set(int index, Node newobj) {
        if (Set_save == null) {
            Set_save = header;
        }
        this.Set_save = Set_save.next();


        while (Set_index == index) {

            Set_save.elementData = newobj.elementData;

            return;
        }
        if (Set_index < index) {
            Set_index++;
            set(index, newobj);
        }
    }

    public void clear() {
        this.header.next = null;
        this.header.elementData = null;
        this.size = 0;
    }

    //    工具类
    private int size_loop(Node n) {

        ++size;
        if (n.next != null) {
//            递归
            size_loop(n.next);
        } else {
            return size;
        }
        return size;
    }

    //    当前链表大小
    public int size() {
        Node x = this.header;
        if (x.next != null && x.elementData != null) {
//        说明还有
            size = 1;
            return size_loop(x.next);
        }
        if (x.next == null) {
            if (x.elementData != null) {
                return 1; //说明有1个 是头
            }
        }
        if (x.next == null && x.elementData == null) {
            return 0;
        }
        return 0;
    }

    //    查找
    public int find(Object obj) {
        int index2 = int_loop(this.header, obj);
        this.index = 0;
        return index2;
    }

    //查找末尾节点方法
    private Node findLast() {
//        从header开始
        if (header.next != null) {
//            说明头节点不是末尾节点

//            调用方法获取节点的next指向
            Node n = header.next;
//          判断下一个是不是
            if (n.next == null) {
//                System.out.println("是头节点的下一个");
                return n;
            } else {

//                说明下一个不是
                return last_loop(n);
            }
        } else {
            System.out.println("末尾是头节点");
//            说明头节点是末尾节点
            return header;
        }
    }

    private boolean remove_loop(Node start, Object obj) {
        index++;
//       判断是否下一个为空 并且值也要不一样
        if (start.next == null && !(start.elementData.equals(obj))) {

            return false;


        }
        if (start.next != null) {
            if (start.next.next == null) {
//            保存
                this.save = start;
            }
        }

//        如果值相等
        if (start.elementData.equals(obj)) {
            if (start.next == null) {
                save.next = null;
                return true;
            }
            start.next = start.next.next;
            return true;
        }
        if (start.next != null) {

            if (start.elementData.equals(obj)) {
//                如果相等
                start.next = start.next.next;
                return true;
            } else {

                //递归
                return remove_loop(start.next, obj);
            }

        }
        return false;
    }

    private int int_loop(Node start, Object obj) {
        index++;
//       判断是否下一个为空 并且值也要不一样
        if (start.next == null && !(start.elementData.equals(obj))) {

            return -1;


        }
//        如果值相等
        if (start.elementData.equals(obj)) {
            return index;
        }
        if (start.next != null) {

            if (start.elementData.equals(obj)) {
//                如果相等
                return index;
            } else {

                //递归
                return int_loop(start.next, obj);
            }

        }
        return index;
    }

    private Node last_loop(Node n) {

//        判断n的下一个
        if (n.next == null) {
//            System.out.println(10);
//            if (n.elementData instanceof Stu) {
//                System.out.println(((Stu) n.elementData).age);
//            }
            return n;


        }
        if (n.next != null) {

            //递归
            return last_loop(n.next);
        }
        return n;
    }

    public Link() {

    }
}

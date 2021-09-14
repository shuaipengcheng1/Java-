package 集合;

import java.util.Objects;

public class Link_Test1 {
    public static void main(String[] args) {
//创建一个Link
        Link link = new Link();


        link.add(new Stu(10)); //添加第一个

        link.add(new Stu(20)); //添加第2个


        link.add(new Stu(30)); //添加第3个
        link.add(new Stu(50)); //添加第4个
        link.add(new Stu(50)); //添加第5个
        link.add(new Stu(50)); //添加第6个
        link.add(new Stu(50)); //添加第7个


        System.out.println(link.size()); //7
        link.clear(); //清空链表
        System.out.println(link.size()); //0


        link.add(new Stu(10));
        link.add(new Stu(10));
        link.add(new Stu(10));
        link.add(new Stu(10));
        link.add(new Stu(10));
        link.add(new Stu(10));
        link.add(new Stu(10));
        link.add(new Stu(10));
        link.add("10");


        System.out.println(link.size()); //9
        System.out.println(link.find("10")); //9
        System.out.println(link.find(new Stu(10))); //1 第一次出现的为值
//        删除
        System.out.println(link.remove("10"));
        System.out.println(link.size()); //8
        System.out.println(link.find("10")); //-1 没找到
        System.out.println(link.remove(new Stu(10))); //true
        System.out.println(link.size()); //7

//        修改
//      link.set(5,new Node(new Stu(20),null));
//      System.out.println(link.find(new Stu(20)));
//        System.out.println(link.size()); //7



    }
}

class Stu {
    public Stu(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Stu)) return false;
        Stu stu = (Stu) o;
        return age == stu.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }


    int age;
}
package 集合;

import java.util.TreeSet;

public class TreeSet_Test04 {
    public static void main(String[] args) {
        //    需求 对Cou类 按年龄大小排序
        Cou Cou = new Cou(10);
        Cou Cou1 = new Cou(20);
        Cou Cou2 = new Cou(90);
        Cou Cou3 = new Cou(30);
        Cou Cou4 = new Cou(70);

        TreeSet<Cou> set = new TreeSet();
        set.add(Cou);
        set.add(Cou1);
        set.add(Cou2);
        set.add(Cou3);
        set.add(Cou4);

        for (Cou item : set
        ) {
            System.out.println(item);
        }

    }
}

class Cou implements  Comparable {
    public Cou(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Object object) { //在底层中 java调用 是 Cou c.compareTo(c2); 所以函数内部this就是c 形参就是c2
//        该方法就是TreeSet的比较逻辑函数 返回值为/  1(向下) -1(向上) 0(不动)

        if(object instanceof Cou){
            Cou c = (Cou) object;
            int age1 = this.age;
            int age2  =c.age;
            if(age1==age2){
//                如果age1 ==age2 就不移位
                return 0;
            }else if(age1>age2){
//                如果age1大于age2 age1向下
                return 1;
            }else {
//               如果age1小于age2 age1向上
                return -1;
            }
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Cou{" +
                "age=" + age +
                '}';
    }

    int age;

}

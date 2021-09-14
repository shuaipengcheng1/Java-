package ObjectOutputSteam_test;

import java.io.Serializable;

public class Student implements Serializable {
//    该接口是一个标志接口 没有需要实现的变量 或者 方法
//    Java虚拟机 看到了 Serializable 接口后 会自动生成一个序列化版本号
//    如果不想 让某一个属性参与序列化 加上transient修饰符


    public Student() {
    }
//    name属性 将不参与序列化
    private transient String name;
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    private  int age;
    private  int ag;
    private  int no;
    private  int no2;


}

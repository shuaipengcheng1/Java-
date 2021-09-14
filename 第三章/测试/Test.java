package 第三章.测试;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
//实例化电脑
        Computer com = new Computer("yoga14s","联想","黑色");

//        实例化学生
        Student s  =new Student(10,"misaka",com);
//        实例化学校
        School sc = new School(s,"cdj");

//        输出学生的电脑信息
        System.out.println(s.c.band);
//        输出学校的学生的名字
        System.out.println(sc.s.name);
    }
}

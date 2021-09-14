package 第三章.学校;

public class 构建 {


    public static void main(String[] args) {
        //    创建学生(人)对象
        人 student = new 人("misaka","男");
//    创建老师(人)对象
        人 teacher = new 人("小王","男");

//    创建老师
        老师 xiaowang = new 老师(teacher,"班主任");
        //    创建学生
        学生 misaka =  new 学生("软件",student,xiaowang);
//    创建学校
        学校 school = new 学校(misaka,xiaowang,"cdj");
        //    输出学校老师的专业
        System.out.println(school.t.vacation);
//        输出学生的老师
        System.out.println(school.s.t.h.name);
    }


}

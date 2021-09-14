package 异常;

import java.util.Scanner;

public class 异常的作业 {
    /*
//    模拟注册

    * 程序开始时 用户 输入 用户名 和 密码 的信息
    * 输入 信息之后 后台java程序 模拟用户注册
    * 注册时 用户名要求长度必须在[6-14]之间 小于or 大于的  都是异常
    *
    * 完成注册的方法要在单独的类中
    * 异常类自定义即可
    *
    * 编写main
    * 在main中调用注册方法
    * */


    public static void main(String[] args) {
//        获取输入值
        Scanner s = new Scanner(System.in);

        System.out.println("输入用户名");
//        转为字符串
        String name = String.valueOf(s.next());

        System.out.println("输入密码");
//        转为字符串
        String password = String.valueOf(s.next());

        UserService user = new UserService();
        try {
            user.Register(name, password);
        } catch (Error e) {
//         捕捉错误
            e.printStackTrace();
        }
    }
}

class UserService {
    public void Register(String name, String password) throws Error {
//检查
        if (name.length() > 6 && name.length() < 14) {

            System.out.println("注册成功!! " + name);

        } else {
            //            抛出错误
            throw new Error("名字长度在[6-14]之间!!");
        }
    }
}

//错误类
class Error extends RuntimeException {
    public Error() {

    }

    public Error(String str) {
        super(str);
    }
}


package 异常;

public class MyError {
//    自定义异常

    //    运行时异常
    static class Error extends RuntimeException {
        //        一个无参数构造
        public Error() {

        }

        //    一个继承 并接受一个字符串
        public Error(String s) {
            super(s);
        }

    }
//编译时异常
//    class Error extends  Exception{
//
//}


    //    创建自定义异常
    public static void main(String[] args) {
        Error e = new Error("报错");
        e.printStackTrace();
        String msg = e.getMessage();
        System.out.println(msg);

    }
}


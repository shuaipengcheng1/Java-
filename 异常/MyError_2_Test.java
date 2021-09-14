package 异常;

public class MyError_2_Test {


    public static void main(String[] args) {
      MyError_2 m=  new MyError_2("出错");
     String str= m.getMessage();
      m.printStackTrace();
      System.out.println(str);
    }
}

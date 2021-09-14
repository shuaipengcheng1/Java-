public class UserService {
    public  static  boolean login(String name,String password){
        if(name.equals("admin")&&password.equals("123")){
            return true;
        }else {
            return false;
        }
    }
    public static void exit(){
        System.out.println("系统已经退出");
    }
}

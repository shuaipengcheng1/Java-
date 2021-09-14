package 第三章;

public class 参数传递 {
    public static void main(String[] args) {
//        add(10);

        user u = new user(10);
        add(u);
        System.out.println(u.age); //11

    }
    public static void  add(user i){
//        i++;
//        System.out.println(i);
        i.age++;
        System.out.println(i.age);//11
    }
    static class user{
        int age;
        public user(int age) {
            this.age = age;
        }



    }
}

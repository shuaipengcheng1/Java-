package 测试;

public class Chinese {
//    中国人 类

//    以下都是实例对象 每一个(new)实例化对象 都有一份
    private  String name ;
    private  String gender;
    private  int age;
    //    将国籍设为静态 因为每一个chinese都是中国
    static   private String country="中国";
    public static String getCountry() {
        return country;
    }

    public static void setCountry(String country) {
        Chinese.country = country;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }







//    构造函数
    public Chinese(String name,int age,String gender){
        this.age=age;
        this.name=name;
        this.gender=gender;

    }
    public Chinese(){
//        调用另一个构造器
this(null,0,null);
    }
}

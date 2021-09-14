package Object;


public class Object_equals5 {

    public static void main(String[] args) {
        Address add = new Address("成都","cjd","61001");
//        Address add2 = new Address("成都","cjd","61001");
        Address add3 = new Address("成都","cj","61001");
        User misaka = new User("23", "msiaka", "18",add);
        User misaka2 = new User("23", "msiaka", "18",add3);
System.out.println(misaka.equals(misaka2));
    }
}
//重写equals方法 当一个用户的用户名和家庭住址都相同 表示同一个用户

class User {
    String id;
    String name;
    String age;
    Address address;

    public User(String id, String name, String age, Address address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof User)) {
            return false;
        }
        if (obj instanceof User) {
//            向下转型
            User u2 = (User) obj;
            if (this.address.equals(u2.address) && this.age.equals(u2.age) && this.name.equals(u2.name) && this.id.equals(u2.id)) {
                return true;
            }
        }
        return false;
    }


    public User() {

    }
}

class Address {
    String city;
    String street;
    String zipcode;

    public Address() {
    }

    public Address(String city, String street, String zipcode) {
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }
public  boolean equals(Object obj){
        if(this == obj){return true;}
        if(obj==null || !(obj instanceof Address)){
            return  false;
        }
        if(obj instanceof  Address){
            Address add2 = (Address) obj;
            if(this.city.equals(add2.city)&&this.street.equals(add2.street)&&this.zipcode.equals(add2.zipcode)){
                return true;
            }
        }

        return false;
}

}
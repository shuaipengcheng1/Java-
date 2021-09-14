package Object;

public class Object_equal3 {
    public static void main(String[] args) {
Student misaka = new Student(200,"cdj");
System.out.println(misaka.toString()); //200 cdj
        Student misaka2 = new Student(200,"cdj");

System.out.println(misaka.equals(misaka2)); //true
        Student misaka3 = new Student(2002,"cdj");

        System.out.println(misaka.equals(misaka3)); //false
x test = new x();
        System.out.println(misaka.equals(test)); //false

    }
}
class Student{
    public Student(int id, String school) {
        this.id = id;
        this.school = school;
    }

    int id;
    String school;
//    重写toString
    public String toString(){
     return  this.id+" "+this.school;
    }
//    重写equals
    public boolean equals(Object obj){
//        如果为自身
         if(this==obj){return  true;}
//         如果为空 或者 obj不是Student 类
         if(obj ==null || !(obj instanceof Student)){
             return false;
         }
//先判断是否为Student类
        if(obj instanceof  Student){
            //         向下转型
            Student s = (Student) obj;
            if(this.id==s.id&& this.school.equals(s.school)){
                return true;
            }
        }

        return false;
    }
}
class x{

}
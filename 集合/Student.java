package 集合;

import java.util.Objects;

public class Student {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student() {
    }

    private  String name;

    public Student(String name) {
        this.name = name;
    }

//    hashcode

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    //    equals
    public boolean equals(Object obj){
        if(this==obj)return true;
        if(obj!=null&&obj instanceof Student){
            Student s = (Student) obj;
            if(s.name.equals(this.name)){
                return true;
            }else {
                return false;
            }
        }
        return false;
    }

}

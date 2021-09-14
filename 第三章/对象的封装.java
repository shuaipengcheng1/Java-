package 第三章;

public class 对象的封装 {
//用户
//    私有化
 private int  age;
// 暴露出去的获取age的方法
    public   int get_age(){
        return this.age;
    }
//    修改方法
    public  void set_age(int data){
        this.age=data;
    }

}

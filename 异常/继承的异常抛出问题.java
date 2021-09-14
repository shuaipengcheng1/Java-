package 异常;

public class 继承的异常抛出问题 {

}


//抛出异常的方法 在重写 时 子类不能比父类抛出的方法更多或者更大 但是可以更少
class  Animal{
    public  void dosome(){

    }
    public  void doOther() throws  Exception {}
}
class cat extends  Animal{
//报错
//    public  void dosome () throws  Exception {
//
//    }


//    正常
//    public  void doOther(){
//
//    }
//正常 可以更小 例如子类
//        public  void doOther() throws NullPointerException {
//
//    }

//    正常
//    public  void doOther () throws NullPointerException , ClassNotFoundException  {}

//    正常
//    public  void doOther() throws RuntimeException {

//    }


}

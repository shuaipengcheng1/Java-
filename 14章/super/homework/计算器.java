package homework;

public class 计算器 {
    public 计算器(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    private double num1 ;
    private double num2;

    public void  add(){
        System.out.println(this.num1+this.num2);
    }
    public void  subadd(){
        System.out.println(this.num1-this.num2);
    }
    public void  mul(){
        System.out.println(this.num1*this.num2);
    }
    public void  div(){
        System.out.println(this.num1/this.num2);
    }

    public static void main(String[] args) {
        计算器 t = new 计算器(10,20);
        t.add();
        t.subadd();
        t.mul();
        t.div();
    }

}


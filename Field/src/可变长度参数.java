public class 可变长度参数 {
    /*
    * 可变长度参数
    * int ...
    * 数据类型 ... 参数名; 参数的数据；类型为数组
    * 可以任意长度
    * 可变长度参数必须在参数列表的最后一个位置上
    * */
    public static void main(String[] args) {
        doSome();  //可以任意长度
        doSome(10,20,30);
        doSome_2(10,"misaka","xxxx");
    }
    public  static  void doSome(int ... agrs){
        for (int item:agrs
             ) {
            System.out.println(item);
        }
    }
    public  static  void doSome_2(int a,String ... args){

    }
}

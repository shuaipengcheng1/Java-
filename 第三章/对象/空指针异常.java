package 第三章.对象;

public class 空指针异常 {
    public static void main(String[] args) {
      Custom c = new Custom();
      c.id=10;
      System.out.println(c.id);
      c=null;
        System.out.println(c.id);  //报错 空指针异常 因为通过c的值(c的值被修改为null) 不能指向一个堆内存
    }
}

public class int类型的转换 {
    public static void main(String[] args) {
//        字符串转int
        int  num1 = Integer.parseInt("100");
//        int转字符串
       String str1= String.valueOf(10);
//        int转intger
        Integer a = 1000;
       Integer i= Integer.valueOf(10);
//        intget转int
      int i2=  i.intValue();
//        字符串转intger
       Integer i3= Integer.valueOf("101");
//        intger转字符串
        String str2 = String.valueOf(i);
    }
}

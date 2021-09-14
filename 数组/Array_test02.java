package 数组;

public class Array_test02 {
    public static void main(String[] args) {
//        动态初始化
        int[] array= new int[5];
        for(int i =0;i<array.length;i++){
            array[i]=10;
            System.out.println(array[i]);
        }
//  动态初始化数组(对象)
        Object[] obj = new Object[5];
        for(int i=0;i<obj.length;i++){
            obj[i]=new x();
            System.out.println(obj[i]);
        }
        System.out.println(obj[0].toString());

    }
}
class x{

}
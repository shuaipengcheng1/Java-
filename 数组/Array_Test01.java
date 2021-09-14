package 数组;

public class Array_Test01 {
    public static void main(String[] args) {
//        静态初始化数组 int
        int[] array={10,20,30};
//        这是c++ 不推荐使用在java中 但是可以通过编译
//        int arr[]={10,20,20};
//        动态
        int[] array2=new int[5];
//        遍历
        for(int i=0;i<array2.length;i++){
//            System.out.println(array2[i]);

//            循环赋值
            array2[i] =10;
            System.out.println(array2[i]);
        }

    }
}

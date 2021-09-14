package 数组;

public class Array_func {
    public static void main(String[] args) {
        int[] arr = {10,20,30};
        Array_func.Test(arr);
    }
    public static void Test(int[] x){
        for (int i = 0; i <x.length ; i++) {
            System.out.println(x[i]);
        }
    }
}

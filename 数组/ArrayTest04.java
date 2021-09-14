package 数组;
//当一个参数为数组时
public class ArrayTest04 {
    public static void main(String[] args) {
        int[] a = {1,2,3};
ArrayTest04.printArr(a);
int [] a2 = new int[2];
ArrayTest04.printArr(a2);
    }
    public  static  void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

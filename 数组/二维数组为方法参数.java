package 数组;

public class 二维数组为方法参数 {
//    动态初始化二维数组
public static void main(String[] args) {
    int [] [] arr= new int[3][3]; //数组里有3个一维数组 里面有三个元素
二维数组为方法参数.printArray(arr);
}
public  static void  printArray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=10;
                System.out.println("二维数组的第"+i+"个数组的第"+j+"个元素的值为"+arr[i][j]);
            }
        }
    }


}

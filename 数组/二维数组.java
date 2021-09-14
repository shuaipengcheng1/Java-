package 数组;

public class 二维数组 {
    public static void main(String[] args) {
//        二维数组初始化 也就是 数据类型[][] 数组名 = {{},{},{}....}
        int[][] arr = {{10,20},{30,40},{50,60}};
//        二维数组遍历

//        最外层 arr层循环 {{},{},{}} 为3
        for (int i = 0; i <arr.length; i++) {
//            里层 arr内层循环 {10,20}  为2
            for (int j = 0; j <arr[i].length ; j++) {
//  打印输出    arr[0][1] 意思为 arr[0] 中的数组的[1]的值 20
//                arr[0][0] 表示为第一个一维数组的第一个元素
                System.out.println(arr[i][j]);
            }
        }
    }
}

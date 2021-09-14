package 数组;

public class 冒泡 {
    //    冒泡排序
    public static void main(String[] args) {
//    定义一个数组
        int[] arr = {3, 2, 7, 6, 8};
        int[] arr2 = {32, 432, 543, 312, 43, 654};
        int[] arr3 = {321,4325,3213,453,657,876,312};
//    经过冒泡排序
//    第一次
//    2 3 7 6 8 (3和2比较 3大 右移)
//    第二次
//    2 3 7 6 8 (3和7比 小 不动)
//    第三次
//    2 3 6 7 8 (7比6大 右移)
//.....
//冒泡.Bubble(arr);
//        冒泡.Bubble(arr2);
        冒泡.Bubble(arr3);
    }

    //   封装为函数
    public static void Bubble(int[] arr) {
//    原理 每一次运行 就是左边的值 与右侧的值对比 如果大就交换 小 就不变
        for (int i = 0; i < arr.length - 1; i++) {
//        如果比右边的大
            if (i == arr.length ? false : arr[i] > arr[i + 1]) {

//            变量box用于暂存
                int box;
                box = arr[i + 1];
                arr[i + 1] = arr[i];
                arr[i] = box;
                //                继续循环 并排除之前的值
                int index = i;
                for (int j = i; j >= 0; j--) {
//
//System.out.println(j);
//                    System.out.println(arr[index]);
//                    System.out.println(arr[j]);
                    if (arr[index] < arr[j]) {
                        //            变量box用于暂存
                        int box2;
                        box2 = arr[j];
                        arr[j] = arr[index];
                        arr[index] = box2;
//                        减一下标 因为小的值已经换到下一个下标了
                        index--;
                    }
                }
            } else {

                continue;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]); //2 3 6 7 8
        }
    }

}

package 常用类;

public class 随机数 {
    //    随机数
    public static void main(String[] args) {
//    0 -10 的随机数
        System.out.println(Math.floor(Math.random() * 10));

//    编写程序 生成5个不重复的随机数 重复的化再重新生成从最终5个数放在数组中
//    定义数组
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            int random = (int) Math.floor(Math.random() * 30);
//循环已经赋值的数组
            for (int j = 0; j < arr.length; j++) {
//                判读是否相等
                if (arr[j] == random) {
//                    相等-1
                    i--;
//                    终止
                    break;
                } else {
//                    不想等 赋值
                    arr[i] = random;
                 break;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println( " 数组 "+arr[i]);
        }
    }
}

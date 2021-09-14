package 数组;

public class 二分法 {
//    以前最常使用的一个数据结构
//    数组查找元素的两种方式
//    第一种 一个一个挨着找 直到找到为止
//    二分法 二分法查找(算法) 这个效率比较高

    public static void main(String[] args) {
        int arr[] = {3,4,87,32};
int index=二分法.Serch(arr,43243);
int[] arr2={1,2,3,4,5,6,7,8,9,10}; //二分法的数组必须先进行排序 可以使用Arrays.sort() or 冒泡和选择排序
二分法.Er_fen(arr2,4,0);

    }

//    普通
    public  static  int Serch(int[] arr,int key){
        //        需求
//        找出 87元素的下标 没有找到返回 -1
        for (int i = 0; i <arr.length ; i++) {

            if(arr[i]==key){
                System.out.println("下表为"+i);
               return i;
            }else {
                if(i== arr.length-1) {
                    System.out.println("没有");
                    return -1;
                }

            }
        }
        return 0;
    }

    public static int Er_fen(int[] arr,int key,int Start){
//        二分法查找的数组 必须要经过排序
System.out.println(Start);
//        公式 (起始下标+长度-1)/2 算出中间值 起始下标第一次默认为0
        int min = (Start+arr.length-1)/2;
        System.out.println(min);

        if(arr[min]==key){
            System.out.println("找到了 下标为"+min);
            return min;
        }else if(arr[min]<key){
            for (int i = min; i <arr.length ; i++) {
                if(arr[i]==key){
                    System.out.println("找到了 下标为"+i);
                }
            }
        }else if(arr[min]>key){
            for (int i = min; i >=0 ; i--) {
                if(arr[i]==key){
                    System.out.println("找到了 下标为"+i);
                }
            }
        }

        return 0;
    }
}



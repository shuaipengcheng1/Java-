package 数组;

public class 选择排序 {
//    每一次 从这堆参与比较的数据当中找出最小值
//    拿着这个最小值和最前面的元素交换位置
//    选择排序比冒泡排序 好在 每一次的交换都是有意义的
//    选择排序比冒泡排序的效率高
public static void main(String[] args) {
    int[] arr = {10,32,432,54353,321};
    int[] arr2 = {13210,33212,434332,5324353,321,3213};

//   选择排序的核心
//    循环一次 然后 找出参加比较中这堆数据中最小的 拿着这个 最小的值与最前面的值交换位置
选择排序.Select(arr,arr.length-1);
    选择排序.Select(arr2,arr2.length-1);

//    for (int i = 0; i <arr.length ; i++) {
//        System.out.println(arr[i]);
//    }
    for (int i = 0; i <arr2.length ; i++) {
        System.out.println(arr2[i]);
    }

}
public  static  void Select(int [] arr,int index){

//        每一次循环完 就是把最大的值放在数组的尾部 并且 再次在剩下的值中循环
//    例如  {10,231,32,43};
//    1               index = length-1
//    {10,43,32,231}  index --    (index控制循环的起始位置)
//    {10,32,43,|231} index --
//    {10,32,|43,231} index --
//    .....
        for (int i = index; i >=0  ; i--) {
            int Max = arr[index];
            if(arr[i]>Max){
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] =temp;

            }

        }


        index--;
//        递归
    if(index>=0){
        Select(arr,index);
    }


}
}

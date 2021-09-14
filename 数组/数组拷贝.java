package 数组;

public class 数组拷贝 {
//    使用arraycopy(Object src（原数组）,  int  srcPos(原数组起始下标),
//                                        Object destO(目标数组), int destPos(目标起始下标),
//                                        int length(拷贝长度)) 方法 是System的静态方法
public static void main(String[] args) {
//原数组
    int[] arr1 = {1,2,4,5};
//    目标
    int[] arr2 =new int[10];
//    调用方法         原数组 原数组起始 目标数组 目标起始  拷贝长度(在原数组的起始下标上做增加 3 就是拷贝 原数组的[0] [1] [2] 也就是 1 2 4 )
    System.arraycopy(arr1,0,arr2,3,3);
    for (int i = 0; i <arr2.length ; i++) {
        System.out.println(arr2[i]); //1 2 4 0 0 ....
    }

//    引用数组?
    String[] arr3= {"java","c++","js","node"};
    String[] arr4=new String[10];
    System.arraycopy(arr3,0,arr4,0,arr3.length);
    for (int i = 0; i < arr4.length ; i++) {
        System.out.println(arr4[i]);
    }

}
}

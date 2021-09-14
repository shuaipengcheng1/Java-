package 数组;

public class Array_track {
    //    编写程序 使用一维数组模拟栈数据结构
//    这个栈可以存储任意java中的引用数据类型
//     这个栈中 提供push 和 pop 分别为压栈 和 弹栈 并且有提示信息
    public static void main(String[] args) {
        Track t = new Track();
        t.push(t);
        t.push(t);

        t.push(t);
        t.push(t);
        t.push(t);
        t.push(t);
        t.push(t);
        t.push(t);
        t.push(t);
        t.push(t);
        t.push(t);

        t.pop();
        t.push(t);
        t.pop();
        t.pop();
        t.pop();
        t.pop();
        t.pop();
        t.pop();
        t.pop();
        t.pop();
        t.pop();
        t.pop();
        t.pop();

        t.pop();

    }

}
//栈

class Track {
    //    一个数组用于充当栈
    private Object[] arr = new Object[10]; // 10的大小

    public void push(Object data) {
//将data压入栈中
        for (int i = 0; i < arr.length; i++) {
//            如果栈中有空值
            if (arr[i] == null) {
                arr[i] = data;
                System.out.println("压栈成功 下标为" + i);
//弹出
                break;
            }
            if (i == arr.length - 1) {
                System.out.println("占满");
//                弹出
                break;
            }
        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println("当前栈数组值为 "+arr[i]+" 下表为 "+i);
//        }

    }

    public void pop() {
//弹栈 是弹出最外层的数据
        for (int i = arr.length - 1; i >= 0; i--) {

            if (arr[i] != null) {
                arr[i] = null;
                System.out.println("弹栈成功 下表为" + i);
//                弹出
                break;
            }
            if (i == 0) {
                System.out.println("栈为空");
//                弹出
                break;
            }
        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println("当前栈数组值为 "+arr[i]+" 下表为 "+i);
//        }
    }
}

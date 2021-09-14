package 异常;


public class 自定义异常的使用 {
    public static void main(String[] args) {
        int[] arr =new int[3];
        Track t = new Track(arr);
        try {
            t.push(10);
            t.push(10);
            t.push(10);
            t.push(10); //改行报错

        } catch (MyError_2 myError_2) {
            for (int i = 0; i <arr.length ; i++) {
                System.out.println(arr[i]);
            }
            myError_2.printStackTrace();

        }



    }
}

class Track {
    private int[] arr;

    public Track() {

    }

    public Track(int[] arr) {
        this.arr = arr;
    }

    //    压栈
    public void push(int num) throws  MyError_2 {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = num;
                break;
            }
            if (i == arr.length - 1) {
//                抛出错误
                MyError_2 m = new MyError_2("栈溢出");
//                抛出错误对象 然后在调用者哪里 使用try catch 来捕捉该对象
               throw  m;

            }
        }
    }
}

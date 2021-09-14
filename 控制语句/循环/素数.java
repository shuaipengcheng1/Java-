package 循环;

public class 素数 {
    public static void main(String[] args) {
        int a=0;
//        素数除了被1和自身可以除 其他都不行
        for(int i=1;i<=10000;i++){
        for(int j=1;j<=i-1;j++){
//        判断
            if(j!=1) {
//             不能为1 或 自身
                if(i%j==0){
//                  break终止循环
                  break;
                }else {
                    System.out.print("这是质数"+i);
                   a++;
                   if(a%8==0){
                       System.out.println('\n');
                   }
                    break;

                }
            }

        }
        }
    }
}

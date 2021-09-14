package 异常;

public class finally_面试题 {
    public static void main(String[] args) {
        int re = m();
        System.out.println(re);
    }

    private static int m() {
        int i =100;
        try {
            /*
            * 在java中 不管是那里的代码 都必须遵循从上倒下的规则
            * 所以 到这行时 i 已经赋值为 100 无法改变
            * */
            return i;
        }finally {
            ++i;
            System.out.println(i); //101
        }
    }
}

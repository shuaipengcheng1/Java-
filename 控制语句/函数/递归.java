package 函数;

public class 递归 {
    public static void main(String[] args) {

int pages =10;
page(pages);
    }
    public static void page(int page){
        if(page<100){
            page++;
            page(page);
        }
        System.out.println(page);
    }
}

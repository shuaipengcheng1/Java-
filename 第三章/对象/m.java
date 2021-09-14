package 第三章.对象;

public class m {
    public static void main(String[] args) {
        Husband h = new Husband();
        h.name = "h";
        Wife w  = new Wife();
        w.name="w";
        h.w = w;
        w.h = h;

////        通过妻子访问丈夫
//
        System.out.println(w.h.name);
////        通过丈夫访问妻子
//
        System.out.println(h.w.name);

    }
}

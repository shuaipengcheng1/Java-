package 集合;
import java.util.List;
import java.util.ArrayList;

public class Foreach_Test02 {



public static void main(String[] args) {
    //    创建list集合
    List<String> list = new ArrayList<>();
    //    添加元素
    list.add("hello");
    list.add("foreach");

//    使用增强for 这里使用的是String 所以可以直接使用String
    for (String item:list
         ) {
        System.out.println(item);
    }
}
}

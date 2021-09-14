package 第三章.对象;


import com.sun.xml.internal.ws.wsdl.writer.document.http.Address;

import java.util.function.Function;

public class user {
int age;
String name;
Address addr;
//实例化方法
    public  void x() {
        System.out.println(this.age);
    }

//构造
    public  user(int age,String name){
        this.age = age;
        this.name = name;
        this.addr = addr;

this.x();

    }
}

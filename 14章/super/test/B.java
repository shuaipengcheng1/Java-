
package test;

    //b类 继承 a类
   public class  B extends A {

        String name;
        //    构造函数
        public  B(int id,String name){
//        调用super方法 来调用父类的构造函数
            super(id);
//        并且如果父类的构造函数不能满足需求 还可以自行添加
            this.name=name;
        }
    }


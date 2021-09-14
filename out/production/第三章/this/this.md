## java中的this
java中的this和js一样
js的this是指向函数的调用者 和实例化对象 (java也是这样)
而 java的this 指向的是对象自身（每一个对象都有this this也是引用数据类型 存储的是对象的地址） 

Custom c =new Custom(); //这里的this指向Cuntom这一个对象（其实也就是指向 c这一个引用）

static方法中 不能有this


## this使用的地方
类方法中 this.
构造函数中 调用其他的构造函数 this()

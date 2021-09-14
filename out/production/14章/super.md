## 什么是super 与 this 又有什么不同点
  1 this
    this能够出现在实例方法和构造方法中
    this的语法有 this.   this()
    this 不能使用在static修饰的方法中 因为没有对象调用(static是静态方法)
    this() 只能出现在构造方法的第一行来调用另一个“本类”中构造函数 目的是代码复用

  2 super
  super能够出现在实例方法和构造方法中
  super的语法有 super.  super()
  super 不能使用在static修饰的方法中 因为没有对象调用(static是静态方法)
  super() 只能出现在构造方法的第一行来调用 目的是调用'父类'的构造函数

  关于使用
  super(); 调用父类实例化
  super. 变量  调用父类变量
  super.方法() 调用父类方法
## 关于继承
  当有继承关系的类调用时 子类中的构造器会自动调用一次 super() 无参数的super  
   所以最好在每一个类中 都写一个无参数构造函数 来防止报错
  

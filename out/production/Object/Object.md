## Object的常用方法
object  clone() //对象克隆
boolean  equals(Object obj) // 判断两个对象是否相等
void finalize() // 垃圾回收器负责调用的方法
类<?>(泛型?)  getClass() // 获取当前对象的运行时类
int  hasCode() // 获取对象的哈希值
String  toString() //将对象转为字符串
  
## 什么时候使用 == 什么时候使用 equals 
判断基本数据类型时 使用 ==
判断引用数据类型时 使用 equals
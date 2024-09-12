## Object类的toString方法
源码
```java
public String toString() {
return getClass().getName() + "@" + Integer.toHexString(hashCode());
}
```
getClass()返回的是包名，getName()返回的是类名
toString表示返回该对象的字符串表示，默认返回的是：全类名+@+哈希值的十六进制。
子类往往会重写toString方法，用于返回对象的属性信息
当直接输出一个对象的时候，toString会默认被调用
如：System.out.println(m1)

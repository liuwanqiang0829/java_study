# java中的注解
1. 注解也被称为元数据(Metadata),用于修饰解释包，类，方法，属性，构造器，局部变量等数据信息。
2. 和注释一样，注解不影响程序的逻辑，但是注解可以被编译或运行，相当于嵌入代码中补充信息。
3. 在javaSE中，注解的使用比较简单，例如标记过时的功能，忽略警告等。在javaEE中注解占据更重要的角色
例如用来配置应用程序的任何切面，代替javaEE旧版中所遗留的繁杂代码和XML配置等


## 基本的注解
使用注解的时候要在其前面增加@符号，并把该注解当成一个修饰符使用,用于它支持的程序元素
### 三个基本的注解：
 @Override:限定某个方法，是重写父类的方法，该注解只能用于方法。
 使用Override的时候，编译器会去检测该方法是否重写了，如果重写了，
 则编译通过，如果没有重写就会报错
 ```java
  @Target(ElementType.METHOD)//@Target是修饰注解的注解，称为元注解
  @Retention(RetentionPolicy.SOURCE)
  public @interface Override {
  }
 ```

 @Deprecated:用于表示某个程序元素(类，方法，字段，包，参数等)已过时。可以做版本兼容过渡
```java
class Child{
//    过时不是不能使用
    @Deprecated
    public void overTime(){
        System.out.println("过时方法的注解");
    }
}
```
@SuppressWaring:抑制编译器警告,当我们不希望看到这些警告的时候，可以使用SuppressWaring抑制警告
`@SuppressWaring({""})`在{""}中你可以写入你希望抑制的信息,比如{"all"}表示所有的警告都会被抑制
还有：{ "rawtypes", "unchecked", "unused" }
@interface不是interface，是注解类，是jdk5接入的。 往后我们看见@interface就表示一个注解类
```java
public @interface Override{}
```

元注解的类型
1. Retention 指定注解的作用范围，三种source,class,runtime
2. Target 指定注解可以在哪些地方使用
3. Documented 指定该注解是否会在javadoc体现
4. Inherited 子类会继承父类的注解


## 自定义注解
public @interface 注解名 {
    修饰符 返回值 属性名() 默认值;
    修饰符 返回值 属性名() 默认值;
}
// 保留至运行时
@Retention(RetentionPolicy.RUNTIME)

实现
```java
// 可以加在方法或者类上
@Target(value = {ElementType.TYPE,ElementType.METHOD})
public @interface RequestMapping {
   public String method() default "GET";
   public String path();
   public boolean required();
}
```



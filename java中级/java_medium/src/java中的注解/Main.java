package java中的注解;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author 刘万强~
 * @version 1.0
 **/
public class Main {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Child c1=new Child();
        c1.overTime();//过时的方法

    }
}

class Father{
    public void print(){

    }

}
class Child extends Father{
    @Override//重写注解
    public void print() {
        super.print();
    }
//    过时不是不能使用
    @Deprecated
    public void overTime(){
        System.out.println("过时方法的注解");
    }
}

//自定义注解
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface Inheritable{

}
@Inheritable
class MyAnnotation{

}

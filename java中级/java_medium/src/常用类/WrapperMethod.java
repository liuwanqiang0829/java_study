package 常用类;

import java.io.IOError;

/**
 * @author 刘万强~
 * @version 1.0
 **/
public class WrapperMethod {
    public static void main(String[] args) {
        Integer i=Integer.valueOf(1);//等价于Integer i=1

        Integer j=Integer.valueOf(1);
        System.out.println(i==j);//true:因为底层使用的是Integer.valueof()方法，
        // 当传入的数值在-128-127之间则直接返回，否则new Integer(i)
        Integer x=128;
        Integer y=128;
        System.out.println(x==y);


        Integer m=128;
        int n=128;
//        只有基础数据类型的时候才判断才是值是否相等
        System.out.println(m==n);
    }
}

package 集合.单列集合;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author 刘万强~
 * @version 1.0
 **/
public class IteratorMethods {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Collection col=new ArrayList();
        col.add(new Person("张三",23,'男'));
        col.add(new Person("李四",34,'男'));
//        现在要遍历col集合
//        1.先得到col对应的迭代器
        Iterator iterator=col.iterator();
//        2. 使用while循环遍历
        while(iterator.hasNext()){

//            返回下一个元素，类型是Object
            Object obj=iterator.next();

            System.out.println("obj="+obj);


        }
//        itit快捷键，使用ctrl+J
//        while (iterator.hasNext()) {
//            Object next =  iterator.next();
//
//        }
        //    3.当退出while循环之后，这时的iterator指向最后的元素，这时再使用
//        iterator.next();//就会抛出异常
//    4.当迭代器指向最后一个元素之后我们需要再次遍历的时候，需要重置迭代器
        iterator=col.iterator();



//        增强for循环
        for(Object obj:col){
            System.out.println("输出obj="+obj);
        }

    }


}

class Person{
    private String name;
    private int age;
    private  char gender;
    public Person(String name,int age,char gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

}

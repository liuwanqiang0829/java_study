package 集合.单列集合;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 刘万强~
 * @version 1.0
 **/
public class CollectionMethods {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        List l1=new ArrayList();
//        1. add添加元素:是要是Object类都可以添加
        l1.add("abc");
        l1.add(123);
        l1.add(123);
        l1.add("jack");
        System.out.println("添加元素="+l1);
//        2. remove删除元素,可以传递对象或者下标
        l1.remove("abc");//l1.remove( new Integer(123))
        l1.remove(0);
        System.out.println("删除="+l1);
//        3. contains查找某个元素是否存在
//        4. size获取元素个数
//        5. isEmpty判断是否为空
//        6. clear清空
//        7. addAll添加多个元素
        List l2=new ArrayList();
        l2.addAll(l1);
        System.out.println("l2="+l2);
        System.out.println("containsAll="+l2.containsAll(l1));
//        8. containsAll查找多个元素是否都是存在的
//        9. removeAll删除多个元素
        List list2=new ArrayList();
        list2.add(new A());
        list2.add(new B());
    }
}

class A {
    public String name="A";

}
class B{
    public String name="B";
}

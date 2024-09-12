package 集合.单列集合;

import java.util.*;

/**
 * @author 刘万强~
 * @version 1.0
 **/
public class SetInterface {
    public static void main(String[] args) {
//        1.以Set接口的实现类HashSet
        Set set =new HashSet();
        set.add("john");
        set.add("jack");
        set.add("jack");
        set.add(null);
        set.add(null);
//        迭代器遍历
        Iterator iterator= set.iterator();
        while (iterator.hasNext()){
            Object obj=iterator.next();
            System.out.println(obj);
        }
//        增强for循环
        for (Object obj:set) {
            System.out.println("增强for循环="+obj);
        }
//        删除
        set.remove(null);
        System.out.println("set"+set);


//        HashSet
        Set hashset=new HashSet();
        hashset.add(null);
        hashset.add("element");
        hashset.add("element");//元素重复加不进去，返回false
        hashset.add(new Dog("jack"));
        hashset.add(new Dog("jack"));
        hashset.add(new String("tom"));
        hashset.add(new String("tom"));//加不进去
        System.out.println("hashset="+hashset);


//        treeSet
//        当希望添加的元素可以按照一定规则来排序的时候
//        TreeSet提供了一个构造器，可以传入一个比较器(匿名内部类)，可以自定义排序规则

        TreeSet treeSet=new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o1).compareTo((String)o2);
            }
        });
        treeSet.add("jack");
        treeSet.add("tom");
        treeSet.add("jet");
        System.out.println("treeSet="+treeSet);
    }
}
class Dog{
    private String name;
    public Dog(String name){
        this.name=name;
    }
}

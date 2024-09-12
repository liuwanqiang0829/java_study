package 集合.单列集合;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * @author 刘万强~
 * @version 1.0
 **/
public class traverseCollection {
    public static void main(String[] args) {

        List list=new ArrayList();
        list.add(new class01());
        list.add(new class02());
        list.add(12);
        list.add("1231");
//        遍历集合的方法
//        1.for循环
        for(int i=0;i<list.size();i++){
            if(list.get(i) instanceof class01){
                System.out.println("for循环class01类="+list.get(i));
            }
            if (list.get(i) instanceof class02){
                System.out.println("for循环class02类="+list.get(i));
            }
        }
//        2. 增强for循环
        for(Object obj:list){
            System.out.println("增强for循环="+obj);
        }
//        3.集合的forEach方法
        list.forEach(obj->{
            System.out.println("list的forEach方法="+obj);
        });
//        4.iterator迭代器
        Iterator iterator=list.iterator();
        while(iterator.hasNext()){
            Object obj=iterator.next();
            System.out.println("迭代器循环="+obj);
        }
//    ListIterator是Iterator的子接口
        ListIterator iterator1=list.listIterator();
        while(iterator1.hasNext()){
            System.out.println("ListIterator子迭代器="+iterator1.next());
        }

    }
}

class class01{

}
class class02{

}


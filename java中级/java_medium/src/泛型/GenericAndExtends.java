package 泛型;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author 刘万强~
 * @version 1.0
 **/
public class GenericAndExtends {
    public static void main(String[] args) {
        ArrayList<Object> arrayList=new ArrayList<Object>();
        ArrayList<Child> arrayList1=new ArrayList<Child>();
        ArrayList<Father> arrayList2=new ArrayList<Father>();
//        main静态方法只能调用静态的属性，所以在使用的时候一般会先声明一个对象，用对象调用属性/方法
        print1(arrayList);
//        print2(arrayList2)
//        print2(arrayList);//不能执行，因为print2方法的参数中类型上限为Child是
        print2(arrayList1);
        superPrint(arrayList);
        superPrint(arrayList1);
        superPrint(arrayList2);//支持

    }
    public static void print1(List<?> list){
        for(Object o:list){
            System.out.println(o);
        }
    }
    public static void print2(List<? extends Child> list){
        for (Object obj:list){
            System.out.println(obj);
        }
    }
    public static void superPrint(List<? super Child> list){
        for (Object obj:list){
            System.out.println(obj);
        }
    }
}

class Father{
   public String  name="1212";
}
class Child extends Father{

    public  void call(){
        System.out.println("1111111111");
    }
}

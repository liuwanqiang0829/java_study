package 泛型;

import java.util.*;

/**
 * @author 刘万强~
 * @version 1.0
 **/
public class GenericBase {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
//        ArrayList添加不同的类的对象
        ArrayList arrayList=new ArrayList();
        arrayList.add(new A("A类1",12));
        arrayList.add(new A("A类2",14));
        arrayList.add(new B("B类1",34));
//        集合中添加了B类和A类，但是希望只能存放A类
        for (Object obj:arrayList){
//            这里不能直接使用A类进行接收，需要对元素进行转型
             A a1=(A) obj;
        }
//        引出泛型
        ArrayList<A> arrayList01=new ArrayList<A>();

        arrayList01.add(new A("A类1",12));
        arrayList01.add(new A("A类2",14));
//        arrayList01.add(new B("B类1",34));//这里就会报错，编译不通过，所以需要可以使用泛型来进行类型的限制
        for (A obj:arrayList01){
//            这里可以直接使用A类进行接收
        }

//        创建泛型类
        C<String> c1=new C("C1");
        HashSet<C> hashSet=new HashSet<C>();
        hashSet.add(new C("字符串"));
        hashSet.add(new C(100));
        HashMap<String,C> hashMap=new HashMap<String, C>();
        hashMap.put("c1",new C("c1map"));
        hashMap.put("c2",new C("c2-map"));
        for (C obj:hashSet){

        }
        Set<Map.Entry<String, C>> enterySet=hashMap.entrySet();
        Iterator<Map.Entry<String,C>> entries=enterySet.iterator();
        while (entries.hasNext()){
            Map.Entry<String,C> next=entries.next();

        }

    }
}

class A{
   private String name;
   private int age;
   public  A(String name,int age){
       this.name=name;
       this.age=age;
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
}
class  B{
    private String name;
    private int age;
    public  B(String name,int age){
        this.name=name;
        this.age=age;
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
}


//泛型中的E是在使用的时候才确定的
class C<E>{
//   标识类的属性类型

    E name;
    public C(E name){
        this.name=name;
    }
    //指定返回类型
    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }
}
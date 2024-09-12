package 泛型;

/**
 * @author 刘万强~
 * @version 1.0
 **/
public class CustomGeneric {
    public static void main(String[] args) {
       Tiger<String,Integer,String> t1=new Tiger("name","string",123,"1212");
//       泛型方法的调用
       t1.fly("String",342);
    }
}

//自定义泛型
class Tiger<T,R,M>{
    String name;
    R r;
    M m;
    T t;
//    T[] tArr=new T[];数组不能实例化，因为数组在new的时候无法确定T的类型，就无法在内存开辟空间
//    static T t2;静态成员是类加载时确定，泛型的类型是在创建对象的时候确定的，此时还没有创建对象，不能完成初始化


//    这种不是泛型方法
    public Tiger(String name, R r, M m, T t) {
        this.name = name;
        this.r = r;
        this.m = m;
        this.t = t;
    }
    public<K,P> K fly(P t,K k){
        System.out.println("t的className="+t.getClass());
        System.out.println("k的className="+k.getClass());
        return  k;
    }
}


interface AnimalInterface<T,K>{

   void run(K k1,T t1);


}

interface  Cat<K,T> extends AnimalInterface<String,Object>{

}

package Object方法;

public class HashCode {
//    hashCode是由Object类定义的，会针对不同的对象返回不同的整数值(这一般是将该对象的内部地址转换成一个整数实现的)
//    hashCode的作用：1.提高具有哈希结构的容器结构。2.两个引用，如果指向的是同一个对象，则哈希值一样。
//    3.两个引用，如果指向的是不同的对象，则hash值肯定不一样。4.哈希值主要是根据地址号来的，不能完全将哈希值等同于地址
//    在集合数据结构中，如果需要回对hashCode方法重写
public static void main(String[] args) {
    Hash1 h1=new Hash1();
    Hash1 h11=h1;
    Hash1 h2=new Hash1();
    System.out.println(h1.hashCode()+" "+h11.hashCode());
    System.out.println(h2.hashCode());
}
}
class  Hash1{

}

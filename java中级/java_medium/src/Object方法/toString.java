package Object方法;

public class toString {
    public static void main(String[] args) {
//        toString表示返回该对象的字符串表示，默认返回的是：全类名+@+哈希值的十六进制。
//        子类往往会重写toString方法，用于返回对象的属性信息
        Object obj1=new Object();
        obj1.toString();
        Monster m1=new Monster("张三");
        System.out.println(m1.toString());
//        当直接输出一个对象的时候，toString会默认被调用
//        如：System.out.println(m1)
        System.out.println(m1);
    }
}
class Monster{
    String name;
    public Monster(String name){
        this.name=name;
    }
//    使用快捷键alt+insert->toString

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                '}';
    }
}

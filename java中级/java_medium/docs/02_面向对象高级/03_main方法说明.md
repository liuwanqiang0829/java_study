## mian方法
我们都知道main方法会执行，那么是怎么执行的?
main方法的形式如下
`public static void main(String[] args){}`

说明：
1. java虚拟机需要调用类的main()方法,所以该方法的访问权限必须是public
2. java虚拟机在执行main()的时候不必创建对象，所以该方法必须是static
3. 该方法的接收String类型的数组参数，该数组中保存执行java命令时传递给所运行的类的参数，案例演示，接收参数
4. java执行的程序会根据参数的位置依次往下传递，如下代码
 ```java
public class hello{
    public static void main(String args){
        for(int i=0;i<args.length;i++){
            System.out.println(i+" ="+args[i]);
        }
    }
}
```
之后在shell脚本中执行`java hello param1 param2...`参数列表就会传递进去

> 注意:在main方法中，我们可以直接调用main方法所在的类的静态方法或者静态属性。
> 但是不能直接访问该类中的非静态成员
> 必须创建一个实例之后才能通过这个对象访问类中的非静态成员。



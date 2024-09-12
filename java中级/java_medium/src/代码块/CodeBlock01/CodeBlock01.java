package 代码块.CodeBlock01;

public class CodeBlock01 {
    public static void main(String[] args){
        Moive m1=new Moive("寒战");
        Moive m2=new Moive("黑社会",12333);
        Moive m3=new Moive("黑社会",232323,"杜琪峰");
    }
}
class Moive{
    private  String name;
    private  double price;
    private  String director;
    public static  int staticNum=getNum();
//    构造器的重载
//    如下我们将三个构造器相同的代码提出来作为一个公共的代码块
//    好处就是不管那个构造器，都会先执行代码块的内容

//    普通代码块
    {
        System.out.println("我是普通代码块");
        System.out.println("开始放电影了");
//        我们给this.name赋值的时候会发现为null，这是因为代码块中的内容会在构造器执行之前执行，所以不会给this.name赋值成功
        System.out.println("this.name="+this.name);
    }
//静态代码块
    static  {
    System.out.println("我是静态代码块，会在类加载的时候执行，而且在类加载的时候执行一次");
    }
    public  Moive(String name){
        this.name=name;

    }
    public static int getNum(){
        System.out.println("获取静态属性的静态方法执行了");
        return  100;
    }
    public  Moive(String name,double price){
        this.price=price;
        this.name=name;
        System.out.println("this.price="+this.price);
    }
    public  Moive(String name,double price,String director){
        this.name=name;
        this.price=price;
        this.director=director;
        System.out.println("this.director"+this.director);
    }
}

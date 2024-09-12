package 代码块.CodeBlock02;

public class CodeBlock02 {
    public static  void main(String[] args){
//        Dog d1=new Dog();
        TestCodeBlock t1=new TestCodeBlock();
    }
}

class Animal{
    public  static  String staticAnimalName="静态属性";
    public  String AnimalName="普通属性";
    {
//        普通代码块中可以使用静态成员(可以使用this访问)和普通成员
        System.out.println("我是Animal类中普通代码块"+"this.name="+this.AnimalName+"this.staticName="+this.staticAnimalName);
    }
    static {
//        静态代码块中只能使用静态成员，并且只能直接使用，不用使用this访问
        staticAnimalName=staticAnimalName+"，";
        System.out.println("我是Animal中的静态代码块"+"this.staticName="+staticAnimalName);
    }
    public Animal(){
        System.out.println("父类的构造器函数");
    }
}
class Dog extends Animal{
    public static String staticDogName=getStaticName();
    public  String DogName=getName();
    {
        System.out.println("Dog类的普通代码块"+"staticDogName"+staticDogName+
                "访问父类的静态属性"+staticAnimalName+"访问父类的普通属性"+this.AnimalName);
    }
    static  {
        System.out.println("我是Dog类的静态代码块"+"访问Dog类的静态属性="+staticDogName);
        System.out.println("我是Dog类的静态代码块"+"staticDogName="+staticDogName+
                "访问父类的静态属性="+staticAnimalName+"访问不到父类的普通属性");
    }
    public Dog(){
        System.out.println("Dog类中的构造器执行了");
    }
    public  static  String getStaticName(){
        System.out.println("代码块中的静态方法执行了");
        return  "我是Dog类的静态成员";
    }
    public  String getName(){
        return  "Dog类的普通属性";
    }
}

class TestCodeBlock{
    public static Dog d1=new Dog();
    {
        System.out.println("TestCodeBlock的普通代码块");
    }
    static {
        System.out.println("TestCodeBlock的静态代码块");
    }
    public TestCodeBlock(){
        System.out.println("TestCodeBlock的构造器执行了");
    }
}
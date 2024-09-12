package 面向对象基础.poly.polyDetail;

public class Animal {
    private String name;
    public int temp=33;
    private int age=18;

    public Animal(String name) {
        this.name = name;
        System.out.println("多态中父类的name==="+name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public  void  eat(String food){
        System.out.println(food);
    }
    private void privateFun(){
        System.out.println("多态不能访问具有权限控制的方法或者属性");
    }
    public void display(){
        System.out.println("父类的display方法，访问父类的temp变量temp==="+temp);
    }
}

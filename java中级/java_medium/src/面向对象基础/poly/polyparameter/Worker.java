package 面向对象基础.poly.polyparameter;

public class Worker extends Employee{
    public Worker(String name,double salary){
        super(name,salary);
    }
    public void work(){
        System.out.println(this.getName()+"正在工作");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual();
    }
}

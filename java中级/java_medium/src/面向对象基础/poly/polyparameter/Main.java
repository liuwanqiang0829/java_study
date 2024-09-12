package 面向对象基础.poly.polyparameter;

public class Main {
    public static void main(String[] args) {
        Employee e1=new Employee("张三",23478.2);
        Employee e2=new Worker("李四",12312);
        Main ma=new Main();
        ma.showSalary(e1);
        ma.showSalary(e2);
        ma.showWoker(e1);
        ma.showWoker(e2);
    }
    public void showSalary(Employee e){
        System.out.println(e.getName()+"的薪水为"+e.getAnnual());
    }
    public void showWoker(Employee e){
        if(e instanceof Worker){
            Worker w = (Worker) e;
            w.work();
        }
    }
}

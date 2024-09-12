package 面向对象基础.poly.polyArray;

public class Student extends Person{
    private double score;
    public Student(String name,int age,double score){
        super(name,age);
        this.score=score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
//    重写父类的say方法
    public String say(){
        return  this.getName()+" "+this.getAge()+" "+this.getScore();
    }
    public void study(){
        System.out.println("学生"+this.getName()+"正在学习");
    }
}

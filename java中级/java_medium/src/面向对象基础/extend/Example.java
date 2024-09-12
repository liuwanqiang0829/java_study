package 面向对象基础.extend;

public class Example {
     public String name;
     public int age;
     private double score;

     public void setScore(double score) {
          this.score = score;
     }

     public double getScore() {
          return score;
     }
     public  void testing(){
          System.out.println(name+" "+age+" "+score);
     }
}

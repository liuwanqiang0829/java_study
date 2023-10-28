public class OverLoad{
    public static void main(String[] args){
       FunOverLoad myFun=new FunOverLoad();
       System.out.println(myFun.add(1,2.3));
    }
}
//方法重载
class FunOverLoad{
  //下面的四个方法构成了重载
  public int add(int a,int b){
     return a+b;
  }
  public double add(double a, int b){
    return a+b;
  }
  public double add(int a, double b){
    return a+b;
  }
  public int add(int a,int b,int c){
    return a+b+c;
  }
}
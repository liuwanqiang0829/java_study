public class VariableParameters{
  public static void main(String[] args){
    Method myMethod=new Method();
    myMethod.sum(2.1,1,3,4);
  }
}
class Method{
  // int...表示可变参数，类型是int,既可以接收0个或者多个int
  // (3)可变参数的本质就是数组
  // (4)可变参数可以普通类型的参数一起放在形参列表，但必须保证可编参数在最后
  public int sum(double num1,int... nums){
    System.out.println("接收的可变参数个数等于"+nums.length+"第一个实参为"+num1);
    return 0;
  }
}
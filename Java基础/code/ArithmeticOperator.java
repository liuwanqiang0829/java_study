public class ArithmeticOperator{
   public static void main(String[] args){
     System.out.println(10/4);//10/4是整型的数值计算，结果为2，取整型
     System.out.println(10.0/4);//结果为2.5，结果为双精度
     double d1=10/4;//结果为2.0
     System.out.println(d1);
     
     //%取模，取余
     //在 % 的本质看成一个公式a%b=a-a/b*b
     System.out.println(10%3);//1
     System.out.println(-10%3);//-1
     System.out.println(10%-3);//1
     System.out.println(-10%-3);

    //++运算符
    int i=1;
    i=i++;//++的使用规则，采用一个临时变量temp，第一步temp=i;第二步：i=i+1；第三步：i=temp，所以结果为1
    int j=1;
    j=++j;//第一步i=i+1,第二步：temp=i,第三步i=temp,结果为2
    System.out.println("i="+i+"j="+j);





   }
}
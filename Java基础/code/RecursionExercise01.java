public class RecursionExercise01{
  public static void main(String args[]){
    F a=new F();
    P pea=new P();
    //斐波那契数列
    System.out.println("fibonacci="+a.fibonacci(5));
    //猴子吃桃
    System.out.println("peachSum="+pea.monkeyPeach(1));
    //老鼠出迷宫
  }
}
//斐波那契数列
 class F{
  public static int fibonacci(int n){
    if(n==1||n==2){
      return n;
    }
    return fibonacci(n-1)+fibonacci(n-2);
  }
}
// 猴子吃桃问题，第一天至第九天吃一半，再吃一个，第十天剩一个，请问总共多少个？
class P{
  public static int monkeyPeach(int n ){
     if(n==10){
      return 1;
     }else if(n>=1&&n<=9){
      return (monkeyPeach(n+1)+1)*2;
     }else{
      return -1;
     }
  }
}
//老鼠出迷宫
class M{
  public 
}

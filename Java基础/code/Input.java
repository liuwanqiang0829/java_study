import java.util.Scanner;//引入Scanner包
public class Input{
  public static void main(String[] args){
    //  创建Scanner对象
    // System.in是Scanner对象中的方法，作用为键盘的输入
    //myScanner.next()是Scanner对象的接收键盘的输入函数
    Scanner myScanner=new Scanner(System.in);
    System.out.println("请输入姓名：");
    String str=myScanner.next();//接收的字符为字符串myScanner.nextInt()表示获取的输入字符为整型数字
    System.out.println("请输入年龄：");
    int num=myScanner.nextInt();
    System.out.println("您的姓名："+str+"您的年龄："+num);
  }
}
package 异常处理;

/**
 * @author 刘万强~
 * @version 1.0
 **/
public class handlerException {
    public static void main(String[] args) {
        try{
            int num1=0;
            int num2=10;
            int res=num2/num1;
        }catch (Exception e){
            System.out.println("异常代码=="+e);
        }
//        try_catch快捷键：ctrl+atl+t
        try {
            String str1="123";
            int a=Integer.parseInt(str1);
            System.out.println(a);
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }
    }
}

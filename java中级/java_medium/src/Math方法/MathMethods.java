package Math方法;

/**
 * @author 刘万强~
 * @version 1.0
 **/
public class MathMethods {
    public static void main(String[] args) {
        System.out.println(Math.abs(-123));//求-123的绝对值
        System.out.println(Math.pow(2,4));//2的4次方
        System.out.println(Math.ceil(-2.923));//向上取整
        System.out.println(Math.floor(-2.923));//向下取整
        System.out.println(Math.round(2.45)+"==="+Math.round(2.55));//四舍五入
        System.out.println(Math.sqrt(9));//开方
        System.out.println(Math.random()+1);//随机生成0-1之间的小数
        System.out.println(Math.max(23,34));//返回两个值中的最大值
        System.out.println(Math.min(23,45));//返回两个值中的最小值
    }
}

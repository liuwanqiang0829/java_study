package 枚举类;

/**
 * @author 刘万强~
 * @version 1.0
 **/
public class EnumerationMethods {
    public static void main(String[] args) {
        enumMethods en1=enumMethods.METHODS;
        enumMethods en2=enumMethods.METHOD1;
        enumMethods en3=enumMethods.METHOD2;

        System.out.println(en1.name());
        System.out.println(en1.ordinal()+"-"+ en2.ordinal()+"-"+en3.ordinal());
//        返回对应的类的所有枚举循坏
        enumMethods[] enArr=enumMethods.values();
        for(enumMethods en:enArr){//增加for
            System.out.println(en);
        }
//        valueOf,执行顺序，根据输入的字符串到enumMethods中去查找枚举对象，找到就返回，否则报错
       enumMethods ValuesOf=enumMethods.valueOf("METHODS") ;
        System.out.println("valuesof="+ValuesOf);
//        编号比较,返回前面的编号减去后面的编号
        System.out.println(enumMethods.METHOD1.compareTo(enumMethods.METHODS));

    }
}
enum enumMethods{
    METHODS,METHOD1,METHOD2;
    private String name;

}

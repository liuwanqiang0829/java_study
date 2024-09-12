package 枚举类;
public class Enumeration {
    public static void main(String[] args) {
        System.out.println(Season.SPRING+"==="+Season.SUMMER);
        Season s1=Season.SPRING;
        Season s2=Season.SPRING;
        System.out.println(s1.toString());
        System.out.println("s1===s2"+(s1==s2));
    }
}
//使用enum代替class实现枚举类
enum Season {
    SPRING("春天"), WINTER("冬天","太冷了"),SUMMER("夏天"),AUTUMN;
   private String name;
   private String desc;
    private  Season(String name){
        this.name=name;
    }
    private  Season(){

    }
    private  Season(String name,String desc){
        this.name=name;
        this.desc=desc;
    }
}
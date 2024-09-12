package 枚举类;

/**
 * @author 刘万强~
 * @version 1.0
 **/
public class CustomEnumeration {
    public static void main(String[] args) {
        System.out.println("CustomSeason.SPRING="+CustomSeason.SPRING);
    }
}

class CustomSeason{
    private String name;
    //    自定义枚举
    public final static CustomSeason SPRING=new  CustomSeason("春天");
    public final static CustomSeason WINTER=new  CustomSeason("冬天");
    public final static CustomSeason AUTUMN=new  CustomSeason("秋天");
    public final static CustomSeason SUMMER=new  CustomSeason("夏天");

    private CustomSeason(String name){
        this.name=name;
    }
}

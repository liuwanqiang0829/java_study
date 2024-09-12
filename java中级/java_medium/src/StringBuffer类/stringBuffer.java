package StringBuffer类;

/**
 * @author 刘万强~
 * @version 1.0
 **/
public class stringBuffer {
    public static void main(String[] args) {
        StringBuffer sb1=new StringBuffer();
        System.out.println(sb1);

//        String和StringBuffer之间相互转换
//        String转StringBuffer
//        第一种方式
        String str1="hello";
        StringBuffer sb2=new StringBuffer(str1);
//        第二种方式
        StringBuffer sb3=new StringBuffer();
        StringBuffer append=sb3.append(str1);

//        StringBuffer转String
//        方式1：toString方法
        String str3=sb2.toString();
//        方式二：String(StringBuffer sb)的构造器
        String str4=new String(sb2);

//        常用方法
        StringBuffer sbu2=new StringBuffer("hello");
        sbu2.append(" world").append(" I am").append(" java");
        System.out.println(sbu2.toString());
         sbu2.delete(0,5);
        System.out.println(sbu2.toString());
        sbu2.replace(0,1,"hello ");
        System.out.println(sbu2.toString());
        System.out.println(sbu2.indexOf("java"));
        sbu2.insert(17,"a ");
        System.out.println(sbu2.toString());

    }
}

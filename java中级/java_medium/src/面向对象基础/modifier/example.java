package 面向对象基础.modifier;

public class example {
    public int n1=123;
    protected String name="john";
    int age=34;
    private boolean isMerry=false;
    public boolean fun1(){
        System.out.println("n1=="+n1+"name=="+name+"age"+age+"isMerry="+isMerry);
        return true;
    }
    protected String fun2(){
        return "protected";
    }
    String fun3(){
        return "default";
    }
    private String fun4(){
        return "private";
    }
}

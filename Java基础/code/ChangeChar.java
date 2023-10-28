public class ChangeChar{
  public static void main(String[] args){
      System.out.println("转义\t字符\t制表位");
      System.out.println("转义\n字符\n换行符");
      // \r表示回车,其中回车后的内容会将前面的字段给覆盖了,如下结果为"转义符'双引号"回车"
      System.out.println("单引号\'双引号\"回车\r转义符");
  }
}
public class PrintStar{
  public static void main(String[] args){

    //第一种打*
    for(int i=0;i<5;i++){
      String str="";
      for(int j=0;j<=i;j++){
       str+='*';
      }
      System.out.println(str);
    }
    //第二种打*
    for(int i=0;i<5;i++){
      String str="";
        for(int j=i;j<4;j++){
          str+=" ";
        }
        str+="*";
        for(int k=0;k<2*i;k++){
            str+="*";
        }
        System.out.println(str);
    }
  }
}
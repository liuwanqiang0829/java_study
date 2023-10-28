public class ObjectParamIsArray{
  public static void main(String args[]){
    Test myTest=new Test();
    int[] arr1={1,2,3};
    myTest.test(arr1);
    for(int j=0;j<arr1.length;j++){
      System.out.print("main方法"+arr1[j]);
    }
  }
}
class Test{
  public void test(int[] arr){
     arr[0]=100;
     for(int i=0;i<arr.length;i++){
        System.out.print("test方法"+arr[i]);
     }
  }
}
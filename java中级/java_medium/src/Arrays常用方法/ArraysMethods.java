package Arrays常用方法;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author 刘万强~
 * @version 1.0
 **/
public class ArraysMethods {
    public static void main(String[] args) {

//        Arrays常用方法
        Integer[] arr={12,23,34,54,2,3,19};
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);//默认排序
        System.out.println(Arrays.toString(arr));
//        定制排序:接口编程的方式
        Arrays.sort(arr,new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return o2-o1;
                    }
                });
        System.out.println(Arrays.toString(arr));

        List aslist=Arrays.asList(12,232,21,5,2);
        System.out.println(aslist);
    }
}

package 集合.双列集合;

import java.util.*;

/**
 * @author 刘万强~
 * @version 1.0
 **/
public class MapMethods {
    public static void main(String[] args) {
        Map map1=new HashMap();
//        添加元素
        map1.put("key1","value1");
        map1.put("key2","value2");
        map1.put(null,null);
        map1.put("key1","value3");//key值重复的时候会替换掉key对应的值
        System.out.println("map1="+map1);
//        获取元素
        System.out.println(map1.get("key1"));
//        遍历Map第一种方式：增强for循环
        Set setArr=map1.keySet();
        for ( Object key:setArr
             ) {
            System.out.println("key="+key+"   value="+map1.get(key) );
        }
        //    遍历Map的第二种方式：迭代器
        Iterator iterator=map1.entrySet().iterator();
        while(iterator.hasNext()){
            Object key=iterator.next();
            System.out.println("迭代器遍历  key="+key+"   value="+map1.get(key));
        }
//        遍历值
        Iterator iterator2=map1.values().iterator();
        while(iterator2.hasNext()){
            Object value=iterator2.next();
            System.out.println("value="+value);
        }
        for (Object val:map1.values()){
            System.out.println("增强for  value="+val);
        }

//        enterSet
        Set entrySet=map1.entrySet();
        for (Object entry:entrySet){
//            将entry转成Map.entry
            Map.Entry me=(Map.Entry) entry;
            System.out.println(me.getKey()+"-"+me.getValue());
        }
        Iterator iterator3=entrySet.iterator();
        while(iterator3.hasNext()){
            Object enterset=iterator3.next();
            Map.Entry me3=(Map.Entry) enterset;
            System.out.println(me3.getKey()+"-"+me3.getValue());
        }


//        Hashtable
        Hashtable hashtable=new Hashtable();
        hashtable.put("key1","value1");
        hashtable.put("key2","value2");
//        hashtable.put(null,null);抛出异常
        System.out.println(hashtable);

//        treeMap,默认构造器创建对象情况下是无序的，传入Compare接口之后可以自定义排序规则

      TreeMap treeMap=new TreeMap(new Comparator() {
          @Override
          public int compare(Object o1, Object o2) {
//              按照键的ascii排序
              return  ((String) o1).compareTo((String)o2);
          }
      });
      treeMap.put("mn","value0");
      treeMap.put("key1","value1");
      treeMap.put("key2","value2");
        System.out.println("treeMap="+treeMap);

    }

}

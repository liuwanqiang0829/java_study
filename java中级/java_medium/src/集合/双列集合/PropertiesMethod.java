package 集合.双列集合;

import java.util.Properties;

/**
 * @author 刘万强~
 * @version 1.0
 **/
public class PropertiesMethod {
    public static void main(String[] args) {
        Properties properties=new Properties();
//        方法和Map一致，但是key-value值不能为null
        properties.put("key1","value1");
        properties.put("key2","value2");
        properties.put("key3","value3");
        properties.remove("key3");
        System.out.println("properties="+properties);
    }
}

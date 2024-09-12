# Map接口
1. Map与Collection并列存在，用于保存具有映射关系的key-value数据
2. Map中的key和value可以是任意引用类型，会封装到HashMap$node对象中
3. Map中的Key不允许有重复，value可以重复
4. Map中的key和value都可以为null,注意key为null只能有一个常用String做为key的类型
5. key-value为一对一的关系
6. Map中存放的数据key-value，存放在一个HashMap$Node中，因为Node底层实现了Entry接口。

### Map接口方法
1. put(key,value)添加
2. remove(key)根据键值删除映射关系
3. get(key) 获取元素值
4. size获取元素个数
5. isEmpty:判断个数是否为0
6. clear：清除
7. containsKey:查找键是否存在
8. keySet获取所有的键
9. entrySet获取所有的关系
10. values获取所有的值

Map接口的遍历方式
1. 先通过Set setArr=map1.keySet()获取到所有键值集合，然后再使用迭代器/增强for循环进行遍历
2. 先通过values获取到所有值的集合，再使用迭代器/增强for循环进行遍历
3. 先通过entrySet获取所有的关系，然后将获取到的关系转成Map.Entry，再通过迭代器/增强for循环进行遍历
```html
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
```

Map接口的实现类：HashMap,Hashtable,Properties
HashMap没有实现同步，因此线程是不安全的



## Hashtable
1. 存放的元素键值对
2. Hashtable的键和值都不能为null
3. hashtable使用方法上和hashMap一致
4. hashtable是线程安全的，hashMap是线程不安全的
5. Hashtable的底层有数组Hashtable$Entry[] 初始化大小为11
6. 临界值：threshold=11*0.75=8,表示元素个数到8个之后开始扩容到11



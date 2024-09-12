# Set接口
1. Set接口存放的数据是无序的(添加和取出的数据不一致)，没有索引
2. 不允许有重复的元素，所以最多包含一个null


## Set接口常用方法
和List接口一样，Set接口也是Collection的子接口，因此，常用方法和Collection接口一样

Set接口的遍历方式
1. 可以使用迭代器
2. 增强for循环
3. 不能使用索引的方式获取


## HashSet
1. HashSet实现了Set接口
2. HashSet其实是HashMap
3. 可以存放null值，但是只能有一个null `public HashSet(){map=new HashMap}`
4. HashSet不保证元素是有序的，取决于hash后，再确定索引的结果
5. 不能有重复的元素/对象，在前面Set接口使用已经讲过

HashSet的方法
1. add() 执行add方法后返回布尔值，失败返回false，成功true
2. remove(element) 删除指定的元素

HashSet底层机制
HashSet底层是HashMap,HashMap底层是(数组+链表+红黑树)，其中存储的值是HashMap中的key值，value值为一个常量

TreeSet的底层是TreeMap
中存储的值是TreeMap中的key值，value值为一个常量

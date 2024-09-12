## List接口方法
List接口是Collection接口的子接口。
1. List集合类中元素有序(即添加顺序和取出顺序一致),且可以重复
2. List集合中的每个元素都有其对应的顺序索引，即支持索引
3. List容器中的元素都对应一个整型的序号记载其在容器中的位置，可以根据索引的位置去存取容器中的元素
4. JDK的API中List实现类有AbstractList,ArrayList,LinedList等等

## 方法
1. add(index,Object ele)//添加元素
2. addAll(list)//添加一个List对象
3. remove(index)//移除
4. indexOf(ele)//从前往后找
5. lastIndexOf(ele)//从后往前查找
6. set(index,ele)修改
7. get(index)获取
8. subList(int startIndex,int endIndex)


### ArrayList
1. ArrayList可以加入null，并且可以加入多个
2. ArrayList是由数组实现的数据存储的
3. ArrayList基本等同于Vector，除了ArrayList是线程不安全(执行效率高)，多线程情况不建议使用ArrayList,
因为ArrayList中的方法没有synchronized修饰，表示线程互斥的关键字。

#### ArrayList底层结构和源码分析
1. ArrayList中维护了一个Object类型的数组elementData,transient Object[] elementData;transient表示瞬间，短暂的，不会被序列化的
2. 当创建ArrayList对象时，如果使用的是无参构造器，则初始elementData容量为0，第一次添加，则扩容为10
如需要再次扩容，则扩容elementData的1.5倍。
3. 如果使用的是指定大小的构造器，则初始elementData容量为指定的大小，如果需要扩容，则扩大至elementData的1.5倍


### Vector
1. Vector底层也是一个对象数组，protected Object[] elementData
2. Vector是线程同步的，即线程安全的，Vector类的操作方法都带有synchronized

扩容机制：
1. 如果是无参，默认10，满后，就按2倍扩容，如果指定大小，则每次按2倍扩


### LinkedList
1. LinkedList底层实现了双向链表和双端队列的特点
2. 可以添加任意元素(元素可以重复)，包括null
3. 线程不安全，没有实现同步

LinkedList的底层操作机制
1. LinkedList底层维护了一个双向链表
2. LinkedList中维护了两个属性first和last分别指向首节点和尾节点
3. 每个节点(Node对象)，里面又维护了prev,next,item三个属性，其中通过prev指向前一个，通过next指向
后一个节点，最终实现双向链表
4. 所以LinkedList的元素的添加和删除，不是通过数组完成的，相对来说效率较高。
5. 模拟一个简单的双向链表
# StringBuffer
## 介绍
java.lang.StringBuffer代表可变的字符序列，可以对字符串内容进行增删，很多方法与String相同，但是
StringBuffer是可变长度的。
说明：
1. StringBuffer直接继承父类是AbstractStringBuilder,
2. StringBuffer实现了Serializable 可以进行串行化，即可以进行网络传输和保存导文件。
3. 在父类AbstractStringBuilder有属性char[] value 不是final。 该value数组存放字符串内容，引出存放在堆中的
4. StringBuffer是一个final类，不能被继承。

与String类的区别：
1. String保存的是字符常量，里面的值不能修改，每次String类更新实际上是更新地址指向，效率较低。private final char value[]
2. StringBuffer的更新实际上可以更新内容，不用更新地址，效率较高 char[] value存放在堆中

## StringBuffer的构造器
1. StringBuffer构造一个不带字符的字符串缓冲区，其初始容量为16个字符
2. StringBuffer(CharSequence seq) public java.lang.StringBuilder(charSequence seq)构造一个
   字符串缓冲区，它包含指定的CharSequence相同的字符
3. StringBuffer(int capacity) :capacity容量，构造一个不带字符的缓冲区，但是具有指定初始容量的字符缓冲区
   即对char[] 大小可以进行指定
4. StringBuffer(String str)构造一个缓冲区，并且将其内容初始化为指定的字符串内容


## 常用方法
1. append(String str) 在StringBuffer字符串后面添加内容
2. delete(startIndex,endIndex) 删除startIndex到endIndex之间的内容
3. replace(start,end,string) //将start到end(不包含end)间的内容替换，不含end
4. indexOf(char a) //查询字串在字符串第1次出现的索引，如果找不到则返回-1
5. insert(startIndex,str)将str插入到字符串中的startIndex位置，并且原来索引为startIndex的位置往后移
6. length获取长度

StringBuilder,String,StringBuffer的比较
1. StringBuffer和StringBuilder非常类似，均代表可变的字符序列，而且方法也一样
2. String不可变的字符序列，效率低，单复用性强
3. StringBuffer:可变字符序列，效率高(增删),线程安全
4. StringBuilder：可变字符序列，效率高，线程不安全

结论：
操作效率：StringBuilder>StringBuffer>String

1. 如果字符串中存在大量的修改操作，一般使用StringBuffer或StringBuilder
2. 如果字符串存在大量的修改操作，并在单线程的情况下，使用StringBuilder
3. 如果字符串存在大量的修改操作，并存在多线程的情况下，使用StringBuffer
4. 如果很少修改，被多个对象引用，使用String,比如配置信息等

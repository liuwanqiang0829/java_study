# 对象中的this
java虚拟机会给每个对象分配一个this，代表当前对象
### 基本特征
1. this关键字可以用来访问本类的属性，方法，构造器
2. this用于区分当前类的属性和局部变量
3. 访问成员方法的语句：this.方法名(参数列表)
4. 访问构造器的语法：this(参数列表);注意只能在构造器中使用-只能在构造器中访问另一个构造器，并且访问语句必须放在第一句
5. this不能在类定义的外部使用，只能在类定义的方法中使用
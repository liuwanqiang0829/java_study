# java开发注意事项
 1.java应用程序的执行入口是main()方法，它有固定的书写格式：public static void main (String[] args){...}

 2.
 
 3.java语言严格区分大小写。

 4.java方法由一条条语句构成，每个语句以";"结束

 5.大括号都是成对出现的，缺一不可

 6.一个源文件中最多只能有一个public类，其他类的个数不限，并且编译后的一个类对应一个.class文件，所以一个java文件可以

 生成多个.class文件

 7.如果源文件包含一个public类，则文件名必须按照该类名命名

 8.一个源文件最多只能有一个public类，其他类的个数不限，也可以将main方法写在非public类中，其他类的个数不限，也可以将
 
 main方法写在非public中，然后指定运行非pubic类，这样入口方法就是非public的main方法
 
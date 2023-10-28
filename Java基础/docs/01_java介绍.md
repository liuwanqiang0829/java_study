# Java 特性
java语言是跨平台性语言（即一个编译好的.class文件可以在多个系统下运行）

java是解释性语言，解释型语言如js，php，不能直接被机器执行，需要解释器来执行。编译型语言，编译后能被机器直接执行如：c/c++

java的idea是eclipse下载地址：https://www.sublimettext.com/3

java的跨平台性的jvm(java的虚拟机),具有指令集并使用不同的存储区域，负责执行指令，管理数据，内存，寄存器，包含在JDK中。不同的平台具有不同的虚拟机。

jdk是java的核心，是java的开发工具包，包含java的运行环境和java的开发工具（如编译器和调试器），

JRE（Java Runtime Environment，Java运行环境），包含JVM标准实现及Java核心类库。JRE是Java运行环境，并不是一个开发环境，所以没有包含任何开发工具（如编译器和调试器）

JVM（Java Virtual Machine），即java虚拟机, java运行时的环境，JVM是一种用于计算设备的规范，它是一个虚构出来的计算机，是通过在实际的计算机上仿真模拟各种计算机功能来实现的。针对java用户，也就是拥有可运行的.class文件包（jar或者war）的用户。里面主要包含了jvm和java运行时基本类库（rt.jar）。rt.jar可以简单粗暴地理解为：它就是java源码编译成的jar包。Java虚拟机在执行字节码时，把字节码解释成具体平台上的机器指令执行。这就是Java的能够“一次编译，到处运行”的原因。

JDK,JRE和JVM的关系：JDK=JRE+开发工具(编译器调试器等)=jvm+java的核心类库+开发工具

JDK下载地址：https://www.oracle.com/java/technologies/javase-downloads.html

假如现在有一个hello.java的文件，那么：

1.在终端运行：javac hello.java 得到hello.class文件，(其中.java文件称为源文件，.class文件称为字节码文件)

2.再运行 java hello 就可以得到对应的效果，本质就是将.class文件装载到虚拟机上运行

环境变量的作用是为了在任意目录，可以去使用对应的指令

其中：%JAVA_HOME%\bin表示找到java的目录的\bin目录，这种方式可以不用随java文件地址改变而改变

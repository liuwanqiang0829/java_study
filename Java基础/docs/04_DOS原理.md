# DOS
 Dos就是Disk Operating System 磁盘操作系统，简单说一下windows的目录结构。
 Dos系统在windows系统的控制台接收指令，解析指令，执行指令

# 常用的DOS命令

(字母大小写不影响指令)

 1.查看当前目录有什么:dir (查看的是绝对路径)
 dir(查看当前目录) dir ../abc查看上一级目录的文件，还有很多协作指令，如/A 显示具有指定属性的文件

 2.切换到其他盘下：cd /d c:(切换到c盘)
 cd /d 是指令 c:为切换的盘符目录

 3.在当前盘的目录下切换：
 (1)cd .. 切换到上一级目录
 (2)cd \ 切换到根目录

 4.tree命令，会将当前目录形成一个目录树，或者在指定的目录下形成目录树

 5.cls清空控制台内容

 6.md创建目录，md test

 7.rd删除目录  del test

 8.copy拷贝文件 copy test.txt ../test将test.txt复制到当前目录的上一级目录的test目录下
 
 9.del删除文件  del test.txt

 10.echo输入文件到目录 echo hello > hello.txt(将hello输入到hello.txt文件中)

 11.move test.txt d:/test.txt将该文件前切到指定的目录下





# break 
1. break语句出现在多层嵌套的语句中时，可以通过标签(可以是任意字符串)指明要终止的那一层语句块
2. break如果没有指定那一层循环，默认为离自己最近的那一层循环
3. 实际开发中最好不要使用label标签，可读性太差
如：
```java
label1:
for(int i=0;i<=10;i++){
  abc2:
  while(true){
    break label1;
  }
}
```
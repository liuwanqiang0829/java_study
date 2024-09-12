# 数组Array
Arrays包含了一系列的静态方法，用于管理和操作数组(比如排序和搜索)


### 常用方法
1. Arrays.toString()//返回数组字符串形式
2. Arrays.sort(arr,callback) 排序(自然排序和定制排序)
3. Arrays.binarySearch(arr,value) 通过二分搜索进行查找，要求必须排好序,返回value的索引
4. Arrays.copyOf(arr,arr.length)将arr.length个元素进行复制,并返回该元素组成的数组
5. Arrays.fill(arr，value)数组的所有元素填充为value值
6. Arrays.equals(arr1,arr2)比较两个数组元素内容是否完全一致
7. Arrays.asList将一组值转换成List
`list <Integer> asList=Arrays.asList(21,3,23,28)`
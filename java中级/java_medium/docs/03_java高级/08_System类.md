# System类
1. System.exit(status)退出当前程序,status代表状态，status=0表示一个正常的状态
2. System.arraycopy(array,startIndex,target,targetIndex,length)：复制数组元素，但是会覆盖目标元素的原来元素值，array代表源数组，target表示复制到那个数组，
   targetIndex复制到目标数组的起始位置，length:代表拷贝的个数。比较适合底层调用，一般使用Arrays.copyOf()来实现复制数组元素
3. currentTimeMillis返回当前时间距离1970.1.1的毫秒数
4. gc:运行垃圾的回收机制
public class FaceObject {
    public static void main (String[] args) {
        //面向对象的三大特征
        //1.封装：将抽象出的数据【属性】和对数据的操作【方法】封装在一起，数据保护在内部，程序的其他部分只有通过被授权的操作【方法】
        // 才能对数据进行操作，封装的好处：隐藏实现的细节（调用函数传参就可以），可以对数据进行验证，保证安全合理
        //封装的实现步骤
        //1.将属性进行私有化【不能直接修改属性】
        //2.提供一个公共的set方法，用于对属性的判断并赋值
        //如：public void setName(类型 参数名){属性=参数名}
        //3.提供一个公共的get方法，用于获取属性的值
        //如：public String getName(){//权限判断，return xx}
    }
}

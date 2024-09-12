package 面向对象基础.poly.polyArray;

public class polyArray {
    public static void main(String[] args) {
        Person[] persons=new Person[5];
        persons[0]=new Person("jack",23);
        persons[1]=new Person("abily",34);
        persons[2]=new Student("张三",12,67);
        persons[3]=new Student("李四",11,78);
        persons[4]=new Student("老张",34,20000);
//        循环调用数组元素的say方法
        for(int i=0;i<persons.length;i++){
            System.out.println(persons[i].say());
//            判断元素的运行类型是不是Student
            if(persons[i] instanceof Student){
                Student stu1=(Student) persons[i];
                stu1.study();
            }
            if(persons[i] instanceof Teacher){
                Teacher t1=(Teacher) persons[i];
                t1.teach();
            }
        }
    }
}

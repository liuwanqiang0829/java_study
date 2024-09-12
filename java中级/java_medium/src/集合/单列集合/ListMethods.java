package 集合.单列集合;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Vector;

/**
 * @author 刘万强~
 * @version 1.0
 **/
public class ListMethods {
    @SuppressWarnings("all")
    public static void main(String[] args) {
//        List集合类中的元素有序(即添加顺序和取出顺序一致)、既可以重复
         List list=new ArrayList();
//         add方法
         list.add("张三");

         list.add("王五");
//         在索引为1的位置插入元素
         list.add(1,"小方");
         List list2=new ArrayList();
        list2.addAll(list);
         list2.addAll(1,list);
//         ArrayList可以存放Null值，其他任何值
        list2.add(null);

        System.out.println("list="+list);
        System.out.println("list2="+list2);
//Vector

        Vector vector=new Vector();
        for (int i = 0; i < 5; i++) {
            vector.add(i);
        }
        System.out.println("vector="+vector);

//        LinkedList
        Node node1=new Node("jack");
        Node node2=new Node("john");
        Node node3=new Node("lucy");
        node1.next=node2;
        node2.prev=node1;
        node2.next=node3;
        node3.prev=node2;
    }
}

class Node{
    public Object item;//真正存放的数据
    public Node next;//指向后一个节点
    public Node prev;//指向前一个节点
    public Node (Object item){
        this.item=item;
    }
    public String toString(){
        return "Node name="+item;
    }
}

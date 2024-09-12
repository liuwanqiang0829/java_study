package 泛型;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 刘万强~
 * @version 1.0
 **/
public class training {
    public static void main(String[] args) {
        DAO<User> dao=new DAO<>();
        User u1=new User("张三",19,1);
        User u2=new User("李四",29,2);
        User u3=new User("王五",29,3);
        dao.save(u1.getName(),u1);
        dao.save(u2.getName(),u2);
        dao.save(u3.getName(),u3);
    }
}

class DAO<T>{
   public  Map<String,T> map=new HashMap<>();
   public void save(String id,T entity){
       map.put(id,entity);
   }
   public T get(String id){
       return  map.get(id);
   }
   public  void update(String id, T entity){
       map.put(id,entity);

   }
    public List<T> list(){
        ArrayList<T> list=new ArrayList<T>();
        list.addAll(map.values());
        return  list;
    }
    public void delete(String id){
       map.remove(id);
    }
}
class User{
    private String name;
    private int id;
    private int age;
    public  User(String name,int age,int id){
        this.name=name;
        this.age=age;
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

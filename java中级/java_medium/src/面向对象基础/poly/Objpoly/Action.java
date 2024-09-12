package 面向对象基础.poly.Objpoly;

public class Action {
    public void animalCry(Animal animal){
        System.out.println(animal.getName());
        animal.feed();
    }
}

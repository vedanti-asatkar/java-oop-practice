abstract class Animal{
    abstract void makesound();

    public void breathe(){
        System.out.println("Breathing");
    }
}
class Dog extends Animal{
    void makesound(){
        System.out.println("Dog barks");
    }
}
class Cat extends Animal{
    void makesound(){
        System.out.println("Cat meows");
    }
}
public class question {
    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat()};
        for(int i=0; i<animals.length; i++){
            animals[i].makesound();
        }
    }
}

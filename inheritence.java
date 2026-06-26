class Animal{
    private String name;
    private String sound;

    public String getName(){
        return name;
    }
    public String getSound(){
        return sound;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setSound(String sound){
        this.sound=sound;
    }
    public void makeSound(){
        System.out.println("The sound  "+ sound);
    }
}
class Dog extends Animal{
    public void fetch(){
        System.out.println("The ball is fetched by the dog.");
    }
    @Override
    public void makeSound(){
        super.makeSound();
        System.out.println("Dog barks");
    }
}
public class inheritence {
    public static void main(String[] args) {
        Dog d= new Dog();
        d.setName("Luna");
        System.out.println("Name of the dog is: "+d.getName());
        d.setSound("bark");
        d.makeSound();
        Animal a=new Dog();
        a.makeSound();
    }
}

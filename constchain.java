class Person{
    int age;
    String name;
    String city;
    public Person(String name){
        this(name, 19, "Pune");
    }
    public Person(String name, int age){
        this(name, age, "Mumbai");
    }
    public Person(String name, int age, String city){
        this.name=name;
        this.age=age;
        this.city=city;
    }
}
public class constchain {
    public static void main(String[] args) {
        Person p=new Person("Vedanti");
        Person p1=new Person("Johan", 19);
        Person p2=new Person("Bella", 8, "Tokyo");
    }
}

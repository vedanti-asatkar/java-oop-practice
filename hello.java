class Person{
    private String name;
    private int age;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if(age>0){
           this.age=age; 
        }else{
            System.out.println("Invalid age");
        }
        
    }
}
class hello{
    public static void main(String[] args) {
        Person p=new Person();
        p.setAge(-5);
        p.setAge(19);
        p.getAge();
        p.setName("vedanti");
        p.getName();
        System.out.println(p.getName() + " " + p.getAge());
    }
}
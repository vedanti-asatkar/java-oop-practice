abstract class Employee{
    String name;
    int salary;

    abstract int calculateSalary();
}
class FullTimeEmployee extends Employee{

    public FullTimeEmployee(String name, int salary) {
        this.name=name;
        this.salary=salary;
    }
    
    int calculateSalary(){
        return salary;
    }
}
class FreelanceEmployee extends Employee{
    int rate;
    int project;

    public FreelanceEmployee(String name, int rate, int project){
        this.name=name;
        this.rate=rate;
        this.project=project;
        
    }
    int calculateSalary(){
        return rate*project;
    }
}
public class employee {
    public static void main(String[] args) {
        FreelanceEmployee fe=new FreelanceEmployee("Loid", 20000, 3);
        FullTimeEmployee fue=new FullTimeEmployee("Yor", 120000);
        System.out.println("The salary for freelance employee is: "+fe.calculateSalary());
        System.out.println("The salary for full time employee is: "+ fue.calculateSalary());
    }
}

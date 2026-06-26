class Calculator{
    public int multiply(int a, int b, int c){
        return a*b*c;
    }
    public int multiply(int a, int b){
        return a*b;
    }
}
public class overload {
    public static void main(String[] args) {
        Calculator c1=new Calculator();
        int a=9;
        int b=12;
        int c=2;
        System.out.println(c1.multiply(a, b));
        System.out.println(c1.multiply(a, b, c));  
    }
}

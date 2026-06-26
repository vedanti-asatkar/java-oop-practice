abstract class Shape{
    abstract void draw();
    void color(){
        System.out.println("coloring the shape");
    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("Drawing a circle");
    }
}
public class abs {
    public static void main(String[] args) {
        Circle c=new Circle();
        Shape s=new Shape();
        c.color();
        c.draw();
    }
}

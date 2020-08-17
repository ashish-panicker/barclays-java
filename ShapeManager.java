public class ShapeManager{

    public static void main(String[] args) {

        Shape s;

        s = new Circle(5.12f, "Circle");
        System.out.println("The area of " + s.getType() + " = " + s.area());

        s = new Square(4f, "Square");
        System.out.println("The area of " + s.getType() + " = " + s.area());

        s = new Rectangle(3f,4f, "Rectangle");
        System.out.println("The area of " + s.getType() + " = " + s.area());

    }
    
}

class PaintManager{
    
}

abstract class Shape{
    
    protected final String type;

    public Shape(String type){
        this.type = type;
        System.out.println("Shape base class constructor.");
        
    }

    protected String getType(){
        return this.type;
    }

    protected abstract float area();

}

class Square extends Shape{

    private float side;

    public Square(float side, String type){

        super(type);

        this.side = side;
    }

    //method overriding
    protected float area(){
        return (side * side);
    }
    
}
class Circle extends Shape{

    private final float PI;

    private float radius;

    public Circle(float radius, String type){
        
        super(type);

        PI = 3.14f;
        this.radius = radius;
    }

    protected float area(){
        return PI * (radius * radius);
    }

}
class Rectangle extends Shape{

    private float length;

    private float breadth;

    public Rectangle(float length, float breadth, String type){

        super(type);

        this.length = length;
        this.breadth = breadth;
    }

    protected float area(){
        return (length * breadth);
    }

}
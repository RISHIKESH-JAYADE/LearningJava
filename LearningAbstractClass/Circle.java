package LearningAbstractClass;

public class Circle extends Shape {
    public static String shapeName = "Circle";
    private int radius;
    
    public Circle(){
        this.radius = 0;
    }

    public Circle(int radius) {
        this.radius = radius;
    }
    public double area(){
        return 3.14 * radius * radius;
    }
    public double perimeter(){
        return 2 * 3.14 * radius;
    }

    
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getShapeName() {
        return shapeName;
    }

}

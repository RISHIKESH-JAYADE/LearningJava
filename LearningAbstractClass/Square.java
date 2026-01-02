package LearningAbstractClass;


//concrete class
public class Square extends Shape {
    private String shapeName = "Square";
    private int side;

    public Square(){
        this.side = 0;
    }

    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    
    }

    public String getShapeName() {
        return shapeName;
    }

    public void setSide(int side) {
        this.side = side;
    }

    
//Below are the abstract methods implementation.
    public double area() {
        return this.side*this.side;
    }

    public double perimeter() {
        return 4*this.side;
    
    }
    
}

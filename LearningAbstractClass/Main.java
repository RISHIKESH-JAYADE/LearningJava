package LearningAbstractClass;

public class Main {

    public static void main(String[] args) {
        

        //Cannot instantiate Shape

        Square sq = new Square();
        sq.setSide(10);
        System.out.println("Area of square");
        System.out.println(sq.area());
        System.out.println(sq.perimeter());

        System.out.println("========");
        System.out.println("area of circle");
        Circle c1 = new Circle();
        c1.setRadius(5);
        System.out.println(c1.area());
        System.out.println(c1.perimeter());
        System.out.println("==========");


        //Polymorphism
        //polymorphism allows you to interact with different shape objects (like Circle, Rectangle, etc.)
        // through a common reference (the abstract Shape class) while each shape performs its own specific behavior.

        Shape[] shapes = new Shape[2];
        shapes[0] = new Square(7);
        shapes[1] = new Circle(6);
        System.out.println("Looping the shapes array");
        //We are interacting with shapes abstract class to fetch the area/perimeter of shapes stored.

        for(Shape s:shapes){
            System.out.println(s.getShapeName());
            System.out.println(s.area());
            System.out.println(s.perimeter());
            System.out.println("++++++++++");
        }


    }

    
}

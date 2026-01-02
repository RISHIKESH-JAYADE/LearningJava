package LearningAbstractClass;


//Abstract classes are ment to be inherited by other classes that provide 
//implementation for its abstract methods.

//The common property of all the shapes are its Area and Parameter.

//Enforce structure:
//Every shape should implement the area and parameter methods as every shape has a differt formula to calculate.

public abstract class Shape {
    
    public abstract double area();
    public abstract double perimeter();
    public abstract String getShapeName();

}

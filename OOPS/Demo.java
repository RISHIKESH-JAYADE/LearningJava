package OOPS;

class Calculator{
    Calculator(){
        System.out.println("Inside Constructor");
    }

    int num = 5; //instance variable is a part of heap.
    
    public int add(int num1, int num2){
        return num1+num2; //num1 and num2 are method variable.
        //method variabels are part of stack
    }
    public double add(double n1, int n2){
        return n1+n2;
    }
}

public class Demo {
    
    public static void main(String a[]) {
    
        System.out.println("Inside main");  
        Calculator calc = new Calculator();   
        //new is used to create an object of class Calculator.  
        //calc is called a reference variable for the object created.
        int i=10;
        int j=29;
        double k = 2.5;
        int result = calc.add(i,j);
        double result1 = calc.add(k,j);
        System.out.println(result1);

    }
}

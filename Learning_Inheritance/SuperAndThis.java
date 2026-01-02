package Learning_Inheritance;

class A {
    A(){
        System.out.println("A class constructor");
    }
    A(int n){
        System.out.println("A class constructor with int parameter");
    }
}

class B extends A {

    B(){
        System.out.println("B class constructor");
    }
    B(int n){
        System.out.println("B class constructor with int parameter");
    }
}

class C extends B{
    C(){
        System.out.println("C class constructor");
    }
    C(int n){
        super(n); //using super(), we can call a constructor from the parent class.
        System.out.println("C class constructor with int parameter");
 
    }
}

class D extends B{
    D(){
        System.out.println("D class constructor");
    }
    D(int n){
        this(); // using this(), we can call one constructor from another constructor.
        System.out.println("D class constructor with int parameter");
    }
}

public class SuperAndThis {

    public static void main(String[] args) {
        B b = new B(); 
        //Output:     
        //A class constructor? every constructor will have the super() method which will execute the constructor of parent class.
        //B class constructor 
        System.out.println("--------------");
        B b1 = new B(5);
        //Output:
        //A class constructor 
        //B class constructor with int parameter
        System.out.println("--------------");
        C c1 = new C(10);
        //Output:
        //A class constructor                     //using default super();
        //B class constructor with int parameter //using super(n)
        //C class constructor with int parameter
        System.out.println("--------------");
        D d = new D(20);

        // A class constructor
        // B class constructor
        // D class constructor
        // D class constructor with int parameter
    }
    
}

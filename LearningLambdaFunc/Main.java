package LearningLambdaFunc;


public class Main {
    public static void main(String[] args) {
        B b = new A(); // A class implements interface B. 
        b.show();
        //anonymous class : no name
        //Created and used only single time. 
        //Mostly used to override methods of an existing class or interface.
        B b1 = new B() {
            public void show(){
                System.out.println("From annonymous inner class");
            }
        };// semicolan because we are declaring and using the object.
        b1.show();

        //Lambda function Implements
        // We know that functional interface has exactly one abstract method.
        // we can replace "new B() { public void show()" with  arrow operator "() -> {<>};"
        // the arrow operator will implement the abstract method and assign it to the object.
        // The object can execute the function.
        B b2 = () -> {
            System.out.println("From lambda function");
        };
        b2.show();

        //Lambda function with parameters

        // C c1 = (i) -> System.out.println("Printing int from C interface "+i); 
        // c1.printInt(5);
        
        C c2 = (i,j) -> i+j;
        int result = c2.add(7, 9);
        System.out.println(result);
    }


}






package LearningInterface;

// Class - Class -> extends
// Interface - Class -> implements
// Interface - Interface -> extends


interface A {
    //By default, all the variables declared in interface are final and static.
    //So, we can't change the value of these variables once they are assigned.

    //An interface is used to define a contract that other non-similar classes must follow.
    int age=26;         
    String profession="Software engineer";      
    void show();;
    void config();
    
}

interface X{
    void run();
}

interface Y extends X  {

    void stop();
}

class B implements A,Y {
    public void show() {
        System.out.println("In Show");

    }
    public void config(){
        System.out.println("In config");
    }
    public void run(){
        System.out.println("In run");
    }
    public void stop(){
        System.out.println("In stop");
    }
}


public class Sample {
    
    public static void main(String[] args) {
        B b = new B();
        b.show();
        b.config();
        b.run();

        A obj = new B();
        obj.show();
        obj.config();
        //obj.run(); not available

        X obj1 = new B();
        //obj1.show(); not available
        //obj1.config(); not available
        obj1.run();
        
    }

}

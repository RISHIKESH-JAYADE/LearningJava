package Learning_Inheritance.DynamicMethodDispatch;

class A{
    public void show(){
        System.out.println("A's show()");
    }
}

class B extends A{
    public void show(){
        System.out.println("B's show()");
    }
}



public class LearningDMD {
    
    public static void main(String[] args) {

        A obj = new A();
        obj.show(); // A's show()

        obj = new B();  
        obj.show(); //B's show()

        //same object reference obj is behaving differently with different objects.

        
    }


}

package LearningInterface;

//You are building a vehicle management system. 
//The system should allow different types of vehicles to perform certain operations like moving and stopping.
// Since these operations (move, stop) are common across all vehicles, you can define them in an interface.


public class Main {
    
    public static void main(String[] args) {

        Vehical c1 = new Car();
        Vehical b1 = new Bike();

        c1.move();
        c1.stop();
        b1.move();
        b1.stop();
        //c1.getSeats(); // This throws error as c1 is or type vehical and does not know what all methods a car has. It knows only two methods.


        
    }


}

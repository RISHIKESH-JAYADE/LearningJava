package LearningInterface;

public class Bike implements Vehical {

    int seats = 2;
    int wheels = 2;
    

    @Override
    public void move() {
        // TODO Auto-generated method stub
        System.out.println("Bike is moving");
        
    }

    public int getSeats() {
        return seats;
    }

    public int getWheels() {
        return wheels;
    }

    @Override
    public void stop() {
        // TODO Auto-generated method stub
        System.out.println("Bike is stopped");
    
    }
    
}

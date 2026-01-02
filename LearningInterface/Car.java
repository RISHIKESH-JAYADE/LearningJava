package LearningInterface;

public class Car implements Vehical {

    private int wheels = 4;
    private int seats = 6;

    public int getWheels() {
        return wheels;
    }

    public int getSeats() {
        return seats;
    }

    public void move() {
        // TODO Auto-generated method stub
        System.out.println("Car is moving");    
    }

    @Override
    public void stop() {
        // TODO Auto-generated method stub
        System.out.println("Car is stopped");
    }
    
}

package LearningEnum;

//enum is class with a list of objects being declared.
// It can have constructors, methods and data for each object.
enum Laptop {
    Macbook(100000), Galaxy(60000), Thinkpad(), Chromebook(40000);         
    //These are the objects of the class Laptop.

    private int price;

    private Laptop(){
        this.price = 10000;
    }

    private Laptop(int price) {     //This will be executed for all the objects being declared.
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    
    
};


public class Main {

    public static void main(String[] args) {

        //Enum.values() is the in-built function to iterate over the objects of enum.
        
        for(Laptop lap: Laptop.values()){
            System.out.println(lap.name() + " " + lap.getPrice());
            
        }


    }
    
}

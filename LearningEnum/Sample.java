package LearningEnum;

enum Status {Initialised,Running,blocked, success };



public class Sample {

    public static void main(String[] args) {

        Status s = Status.Running;

        switch (s) {
            case Initialised:
                System.out.println("Starting");
                break;
            case Running:
                System.out.println("Executing");
                break;
            case blocked:
                System.out.println("Deadlock");
                break;
                
            default:
                System.out.println("Done");
                break;
        }
        
    }
    
}

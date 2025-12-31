package OOPS;

public class ExploringObjectClass {


    public static void main(String[] args) {
        
        Dog d = new Dog();
        d.setName("Dhruv");                 //only public methods are allowed to access the private varibale
        d.setBreed("German Shepard");

        Dog d1 = new Dog();
        d1.setName("Tuffy");
        d1.setBreed("Indian Spitz");

        Dog d2 = new Dog();
        d2.setName("Tuffy");
        d2.setBreed("Indian Spitz");

        System.out.println(d.toString());       //toString() is declared in Object class. we can override it
                                                //every class extends object class by default.
        System.out.println(d2.equals(d1));
        System.out.println(d1.hashCode());
        System.out.println(d2.hashCode());
    }
    
}

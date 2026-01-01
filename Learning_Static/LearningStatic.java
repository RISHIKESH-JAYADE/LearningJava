package Learning_Static;

class Mobile{
    String brand;   //instance variable - Different for each object created
    int price;
    static String type; //static variable - Same for all the objects
    static{
        System.out.println("inside static block"); //executed exactly once -> at the time of class loading.
    }


    public Mobile(String brand,int price){          //parameterised constructor
                                                    //constructor should have same name as that of the class.
        System.out.println("Inside constructor"); //everytime object is created, consturctor is called.
        this.brand = brand;
        this.price = price;
        //this.type = type;
    }
    void show(){    //It is a instance method -> it is specific to objects created
        System.out.println(brand + " : "+price+" : "+type);
    }
    static void show1(){ //static method -> available for class variables.
        System.out.println("Static Variable type :"+type);
    }
    static void show1(Mobile obj){
        System.out.println(obj.brand + " : "+obj.price+" : "+type);
    }
}

public class LearningStatic {

    public static void main(String[] args) throws ClassNotFoundException {

        Class.forName("Learning_Static.Mobile"); //Class is loaded -> static block is executed -> objects are instnaciated.
        Mobile m1 = new Mobile("Samsung", 50000 );
        Mobile m2 = new Mobile("Apple", 80000);
        Mobile.type = "WirelessPhone"; //As static variables are same for all the objs we can call it via class name.

        m1.show();//to call instance method we need an object.
        m2.show();
        Mobile.show1(); //static method has access to static variables.
        Mobile.show1(m1); //Called a static method with the obj so that static method has access to obj variables.
    
        //why main has static?
        //because main is a static method and it is called by JVM.
        //if static is not specified, then we need to create an object of Class LearningStatic
        //and then call main method via that object. 
        //JVM needs to start somewhere to create object. The static solves the issue.
    }

    
}

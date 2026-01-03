package Learning_Wrapper;
//Wrapper classes vs primitive data types
//primitive datatypes are used to store data without any additional functionality.
//If a Wrapper class is used, we will store the data in an object with greater functionality.


public class LearningWrapperClass {

    public static void main(String[] args) {
        int num = 10;
        Integer num1 = new Integer(num); //Boxing : putting a value inside the wrapper class

        Integer num2 = num; //Auto-boxing
        //num2 is an object of class Integer
        int n = num2; //un-boxing
        System.out.println(n);
        System.out.println(num2.getClass());
        System.out.println(num2.intValue());
        System.out.println(num2.toString().getClass());
        
        String str = "12";
        num1 = Integer.parseInt(str);      
        //parseInt is the static method due to which it can be used using class name.
        //The method is available even if the Class is loaded. No need to have a object.
        System.out.println(num1+2);


        
            
    }    

    
}

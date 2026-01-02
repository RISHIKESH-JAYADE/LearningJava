package LearningExceptions;

class Division{
    int result = 0;
    Division(int a,int b) throws ArithmeticException{  //constructor cannot return anything
         result = a/b;      // It throws Arithmatic exception which should be handled by main.

    }
    public int getResult(){
        return result;
    }
}

public class Main {

    public static void main(String[] args) {
        
        int i = 20;
        int j = 0;
        String str=null;

        try{
        Division d = new Division(i,j);
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic Exception Occured");
            e.printStackTrace();
        }
        //System.out.println(d.getResult());



        try{
            j = 18/i;
            //throw key word is used to throw an exception object, so that catch handles the exception.
            if(j==0){
                throw new CustomException("throwing the exception using throw");
            }
            int z = str.length();
        }
        catch (CustomException e){
            System.out.println("Caught custom exception: "+e.getMessage());
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch (NullPointerException e){
            System.out.println(e);
        }
        catch (Exception e){        //exception is a parent class and it should be at the bottom becase the JVM will look for the one who handles and parent class can
                                    //handle all exceptions.

            System.out.println("something went wrong "+ e );
        }
        System.out.println("continue executing the code..");

    }
    
}

package LearningLambdaFunc;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class CommonFunctionalInterface {

    public static void main(String[] args) {

        //Predicate<T> : to check if its true or false.
        //Represents a boolean-valued function of one argument.
        //Method: boolean test(T t)
       
        Predicate<Integer> isEven  = (i) -> {
            //check for odd or even
            if(i%2==0){
                return true;
            }
            else return false;
        };

        System.out.println("Is num 10 even: "+isEven.test(10));

        //Function<T,R>: accept one argument and return a result.
        //Method: R apply(T t)
        
        Function<Integer,Integer> factorialFunc = (i) -> {
            int fact=1;
            for(int j=i;j>0;j--){
                fact = fact *j;
            }
            return fact;
        };
        System.out.println("factorial of 5: "+factorialFunc.apply(5));


        //Consumer<T>: Accepts single argument and returns nothing.
        //Method:  void accept(T)

        Consumer<String> greet = str -> { System.out.println("Hello "+str); };
        greet.accept("Rishikesh");

        //Supplier<T>
        //Represents a supplier of results.
        //Method: T get()
        
        Supplier<String> output = () -> "Hello world!!";
        System.out.println(output.get());

        //T BinaryOperator<T>
        // accepts two arguments with same type and returns same type of output
        // Method: T apply(T t1,T t2)
        BinaryOperator<Integer> addFunc = (a,b) -> a+b;
        BinaryOperator<String> concatFunc = (a,b) -> {return a+b;};

        System.out.println(addFunc.apply(10,30));
        System.out.println(concatFunc.apply("rishi","Jayade"));
        
        //UnaryOperator<T>
        //accept one arguement and return one of same type.
        //Method T apply(T t1)
        UnaryOperator<Integer> square = (a) -> a*a;

        System.out.println(square.apply(12));


    }
}

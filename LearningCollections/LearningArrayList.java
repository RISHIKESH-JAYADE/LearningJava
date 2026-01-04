
package LearningCollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

class LearningArrayList {

    public static void main(String[] args) {
        //Collection is an interface. It consist of generic list of functions that
        //implementing class should implement.       
        //<T> is called a generic. This will allow us to specify the Type of data we
        //are going to store in the collection. In this case, we are going to store Integers.

        Collection<Integer> nums = new ArrayList<Integer>(); //ArryList is a class which implements Lists interface, which further extends Collection interface.
        Random rand = new Random();
        //ArrayList creates an empty list with initial capacity 10. It can increase or decrease
        //its size dynamically as we add or remove elements from it.
        for(int i=0;i<20;i++){
            nums.add(rand.nextInt(100));
        }
        System.out.println(nums);
        Object[] arr;
        arr = nums.toArray();
        
        System.out.println(arr[2]);


        //List: It is an interface which extends Collection interface.
        //It provides methods to access elements by index, insert or delete elements.
        //It enhances the Collection interface with more functionality.

        List<Integer> listOfInt = new ArrayList<Integer>();
        
        for(int i=0;i<20;i++){
            listOfInt.add(rand.nextInt(100));
        }

        System.out.println("Size :"+listOfInt.size());
        System.out.println(listOfInt.indexOf(23));
        System.out.println(listOfInt.subList(12 , 20));
        
        //Comparator<Integer> comp = new Comparator<Integer>() 
        Collections.sort(listOfInt);
        System.out.println(listOfInt);


        


    }
     
}
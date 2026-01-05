package LearningCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LearningComparator {
    
    public static void main(String[] args) {
        //Get a list of Names and sort them on the bases string len.

        String[] names = {"Rishikesh","Ashwin","Yashica","Ganashree Vaishanvi"};
        Arrays.sort(names);
        System.out.println("Default Sorting");
        for(String s:names){
            System.out.print(s+" ");
        }
        System.out.println();
        List<String> namesCollection = new ArrayList<>();
        namesCollection.addAll(Arrays.asList(names));
        System.out.println("---------");
        System.out.println(namesCollection);
        //comparator is a functional interface(SAM)-> use Lambda function
        Comparator<String> comp = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // TODO Auto-generated method stub
                if (o1.length() < o2.length()){
                    return 1; //switch
                }
                else{
                    return -1; //dont switch
                }
            }
        };

        Collections.sort(namesCollection,comp);
        System.out.println("Using comparator to sort using length of str");
        System.out.println(namesCollection);

    }

}

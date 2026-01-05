package LearningCollections;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class LearningSetAndIterator {
    
    public static void main(String[] args) {
        
        Set<Integer> s = new HashSet<Integer>(); 
        //Set Implements Collections and Hashset implements Set.
        //Set does not store duplicate values. All values should be unique.

        //Set<Integer> s = new TreeSet<Integer>(); TreeSet stores the values in sorted way.
        Random rand = new Random();
        
        for(int i=0;i<100;i++){
            s.add(rand.nextInt(100));
        }
        
        Iterator<Integer> iter = s.iterator();

        while(iter.hasNext()){
            System.out.println(iter.next());
        }
        
        
    }
}

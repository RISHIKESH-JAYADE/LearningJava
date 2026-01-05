package LearningCollections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class LearningMap {

    public static void main(String[] args) {
        //Map is a interface and HashMap is the class which implements the Map interface.
        //Map saves values in key value pair.
        // Interface: Map
        // Implementation Classes: 
        // - HashMap - fastest, no order
        // - LinkedHashMap - slow but order is maintained.
        // - TreeMap - Sorted map on basis of key value.
        //Map does not extends Collection interface.
        
        Map<String,Integer> m = new HashMap<>();
        
        m.put("rishikesh", 26);
        m.put("Ashwin",26);
        m.put("Dattu",23);
        m.put("sushya",26);

        System.out.println(m);
        System.out.println(m.keySet());
        System.out.println(m.values());

        m.remove("Ashwin");
        //Iteration over the map.
        for ( Map.Entry<String,Integer> entry : m.entrySet()) {

            if(entry.getKey()=="rishikesh"){
                m.remove(entry.getKey()); //ConcurrentModificationException
                //This should not be used. always use iterator.
            }
            else{
                System.out.println(entry.getKey()+" : " + entry.getValue());
            }
            
        }


        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        for (String s : list) {
            if (s.equals("B")) {
                list.remove(s);  //  modification during iteration ConcurrentModificationException
            }
            
                System.out.println(s);
        
        }

        //Iterator is an interface which is implemented by Collection framework classes (arraylist, hashmap etc),
        //Iterator is an stateful object. It stores the current state or value and iterates over the elements.
        // hasNext() and next() functions help us to navigate.


        Iterator<String> iter = m.keySet().iterator();

        while(iter.hasNext()){
            String str=iter.next();
            System.out.println(str+" : "+m.get(str));
        }

        //Iterable is an interface extended to Collection framework. This makes every collection iterable.
        //it returns iterator object so that the collection can be iterated. The forEach loop for map and arraylist use iterator internally to iterate.
        


    }
    
}

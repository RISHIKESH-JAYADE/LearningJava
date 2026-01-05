package LearningCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student>{

    public int age;
    public String name;

    
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }


    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }


    @Override
    public int compareTo(Student that) {
        // TODO Auto-generated method stub
        if(this.age>that.age){
            return 1;
        }
        else   
            return -1;
       
    }
    
}


public class LearningComparable {

    public static void main(String[] args) {

        List<Student> studs = new ArrayList<>();
        studs.add(new Student(26,"Rishikesh"));
        studs.add(new Student(28, "Omkar"));
        studs.add(new Student(23, "Dattaraj"));
        studs.add(new Student(18, "Amruta"));

        for(Student s: studs)
            System.out.println(s);

        Comparator<Student> comp = new Comparator<>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.age > o2.age)
                    return 1;
                else    
                    return -1;
            }
        };

        //Problem statement: Sort the above List with respect to age.
        //we need to create a annonymous class to create a comparator and pass
        //it to Collections.sort() method.
        
        // Collections.sort(studs,comp);
        // System.out.println("==============");
        // for(Student s: studs)
        //     System.out.println(s);
        
        //Comparable interface
        //If a class implements comparable class, then we do not have to specify the comparator.
        //We can directly use Collections.sort() method.
        //The comparable interface has a method called compareTo. 
        
        Collections.sort(studs);
        System.out.println("==============");
        for(Student s: studs)
          System.out.println(s);


    }
    
}

//Encapsulation: Binding data with the methods. Only way to access the data is via methods.
//Human Analogy: Every person has data and common behaviour. Like human has name and age and behaviour as speaking, writing or typing.
//Whenever one needs data he should ask for that and not access it directly.

package Learning_Encapsulation;


class Human {
    private int age;        //They both are private variables.
    private String name;    //They are visible only in this particular class. Outside world does not have access to them.
    public static String scientificName; //this is a public variable and can be accessed from outside world directly. Method is not needed.

    public int getAge(){
        return age;
    }
    public void setAge(int a){          //These are getters and setters.
        age = a;                        //They have access to the private data so that they can set and get the data variables.
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;               //this is a java keyword which represents the current object: the object calling this method.
    }

}

public class LearningEncapsulation {
    public static void main(String args[]){

        Human obj = new Human();
        obj.setName("Rishikesh");
        obj.setAge(26);
        System.out.println("Name: "+obj.getName()+" : "+obj.getAge());
        //The above age and name variables are private but the getter and setter are public
        //due to which the age and name is accessed via methods and not directly.        

        Human.scientificName = "Homo Sapiens";
        //The above variable is a public static variable. we can access it directly without the use of method.
        System.out.println(Human.scientificName);
    }
}

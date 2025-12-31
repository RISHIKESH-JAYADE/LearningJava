package OOPS;
//classes should be public
//One file One class
//instance variables private
//instance methods public
public class Dog {             //every class extends object class by default
    //properties
    private String name;
    private String breed;
    //getters
    public String getName() {
        return name;
    }
    public String getBreed() {
        return breed;
    }
    //setters
    public void setName(String name) {
        this.name = name;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }

    //behaviour
    public String bark(){
        return "Woof Woof";
    }
    public String eat(){
        return "Eating";
    }
    public String sleep(){
        return "Sleeping";
    }

    //overriding toString
    @Override
    public String toString() {
        return "Name: "+this.name + "\n" + "Breed: " + this.breed;
    } 

    public boolean equals(Dog that){
        return this.name==that.name && this.breed==that.breed;
    }


}

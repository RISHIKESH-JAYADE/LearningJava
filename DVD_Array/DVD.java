package DVD_Array;

public class DVD {
    public String name;
    public int releaseYear;
    public String director; 
  //  public String[] actors;

    //Constructor
    public DVD(String name,int releaseYear, String director ){
        this.name = name;
        this.releaseYear = releaseYear;
        this.director = director;
        //this.actors = actors;
    }

     public String toString(){
        return this.name + ", directed by " + this.director + " , released in "+ this.releaseYear; 
     }

}


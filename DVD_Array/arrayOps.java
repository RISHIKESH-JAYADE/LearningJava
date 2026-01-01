package DVD_Array;
//import DVD_Array.DVD;
public class arrayOps  {


    public static void main(String[] args) {

         
        //DVD[] dvdCollection = new DVD[15];
        
        // DVD list
        DVD AvengersDVD = new DVD("AVENGERS", 2012, "Joss Whedon");
        DVD IronManDVD = new DVD("IRON MAN", 2008, "Jon Favreau");
        DVD CaptainAmericaDVD = new DVD("CAPTAIN AMERICA", 2011, "Joe Johnston");
        DVD ThorDVD = new DVD("THOR", 2011, "Kenneth Branagh");
        DVD HulkDVD = new DVD("HULK", 2008, "Louis Leterrier");


        DVD dvdCollection[] = new DVD[15];
        //Insert DVDs in the array
        dvdCollection[0] = AvengersDVD;
        dvdCollection[1] = IronManDVD;
        dvdCollection[2] = CaptainAmericaDVD;
        dvdCollection[3] = ThorDVD;
        dvdCollection[4] = HulkDVD;
    
        DVD starWarsDVD = new DVD("Star Wars", 1977, "George Lucas");
        //Star wars is the oldest movie and should be present in 0th position.
        //So we need to shift all the DVDs to the right by one position.
        int l=0;
        for(DVD d:dvdCollection){
            if (d!=null)
                l++;
            else   
                break;
        }

        for(int i=l+1; i>0; i-- ){
            dvdCollection[i] = dvdCollection[i-1];
        }
        dvdCollection[0] = starWarsDVD;


        // for(int i = 0; i<15; ++i){
        //     System.out.println(dvdCollection[i].toString());
            
        // }
        System.out.println("len: "+dvdCollection.length);

        for(DVD d: dvdCollection){
             System.out.println(d);
         }

        System.out.println("Given a binary array, find the maximum number of consecutive 1s in this array.");


        int[] arr = {1,1,0,1,1,1};
        System.out.println("input {1,1,0,1,1,1}"); 
        

        int result  = Solution.findMaxConsecutiveOnes(arr);
        System.out.println(result);

        //System.out.println((int)Math.log10(213)+1);

    }
}

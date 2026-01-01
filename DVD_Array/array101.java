package DVD_Array;
//whenever we have fixed size and want to store multiple values : Arrays
public class array101 {
    public static void main(String a[]){

        //store 10 values of type int
        int array[] = {1,2,3,4,5};

        int array1[] = new int[5]; //the size of array is 5 and by default all the values are set to 0;
        System.out.println("array lenght: "+ array1.length);
        //set the values
        array1[0] = 12;
        array1[1] = 14;
        array1[2] = 1;
        for( int i=0; i<5; ++i) //i is local to the loop and cant be used outside
            System.out.println(array1[i]);


        System.out.println("++++ enhanced for loop +++");
        for(int z:array)
            System.out.println(z);

        //multi-dimensional array 
        int matrix[][] = new int[3][4]; //3 rows 4 columns
        int x[] = {1,2,3,4};
        int y[] = {5,6,7,8};
        int z[] = {9,10,11,12};

        matrix[0] = x;
        matrix[1] = y;
        matrix[2] = z;

        //generate random values
        float matrix1[][] = new float[3][4];
        //double random = Math.random() * 100;

        for(int i=0;i<3;i++)
            for(int j =0; j<4;j++)
                matrix1[i][j] = (float)Math.random() * 100;

        for(int i=0;i<3;i++){
            System.out.print("Matrix "+i+": ");
            for(int j=0;j<4;j++){
                System.out.print(matrix1[i][j]+",");
            }
            System.out.println();
        }

        //enhanced for loop

        for(float j[]:matrix1){
            for(float q:j){
                System.out.print(q);
            }
            System.out.println();        
        }    

        //Jagged array
        int matrix2[][] = new int[3][];//3 rows but colums ?
        
        matrix2[0] = new int[4];
        matrix2[1] = new int[3];
        matrix2[2] =  new int[2];
        System.out.println("Jagged matrix");

        for (int i=0; i<matrix2.length; i++){

            for (int j=0; j<matrix2[i].length; j++)
            {
                matrix2[i][j]= (int)(Math.random() * 10);
            }
        }
        System.out.println("--------");
        for (int i=0; i<matrix2.length; i++){
            for (int j=0; j<matrix2[i].length; j++){
                System.out.print(matrix2[i][j]+" ");
            }
            System.out.println();
        }

        
        //Create a array from a custom class and use it.    
        
        DVD d0 = new DVD("Krish", 2012, "Rakesh Roshan");
        DVD d1 = new DVD("Dhoom",2013,"Karan");
        DVD d2 = new DVD("Jawan",2023,"Yash");
        
        DVD d[] = new DVD[3];
        
        d[0] = d0;
        d[1] = d1;
        d[2] = d2;

        for(DVD n:d){
            System.out.println(n.name+" : "+n.director);
        }

        System.out.println(d[0].toString());

    }
}

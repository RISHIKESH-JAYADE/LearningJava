class Hello
{

    public static void main(String args[])
    {
        int num = 10; // 4bytes
        int num2 = 10;
        System.out.println("Comparing both the variables -> (num==num2) : "+(num==num2));
        byte num1 = 127; // the range of byte data type is -128 to 127, similarly we have long,short.
        long l = 54334l;

        String nick_name = "rishi";
        String official_name = "rishi";
        System.out.println("Comparing both the strings -> (nick_name==official_name) :  "+(nick_name==official_name));//true
        //The String values are stored in string constant pool and
        //if two variables contain same value then they both will have same address. 
        
        String str1 = new String("rishi");
        String str2 = new String("rishi");
        System.out.println("Comparing both the strings -> (str1==str2) : "+(str1==str2));//false
        //Here both the variables are created using new keyword (new object of String class is created)
        //So both the variables will have different address in heap memory.


        float cgpa = 5.7f; //double data type is used by default due to which specifying f to make it a float.
        char t = 'T';
        //boolean b;

        System.out.println("Hello world!");
        char t1 = (char)(t+1);
        System.out.println("char t='T' -> char(t+1) = "+t1); //Output U


        int a = 30; 
        int b = 61;
        int result = (~a & b) | (a & ~b); //bitwise operator. ~a complement of a
        System.out.println("compliment of 30 (~a) = "+~a);
        System.out.println("compliment of 61 (~b) = "+~b);
        System.out.println("(~a & b) | (a & ~b) = "+result);

        int x=5;
        int y=10;

        int z = (x++ > 5 && y-- < 9)? x-- : y;//&& if one is false complete expression is false
        System.out.println("z = " +z + " x= " + x + " y = "+y); //z=y=10 , x = 6 ,y = 10


        int i, j;

        i = 100;

        j = 300;

        while(++i < --j);

        System.out.println(i);

        main("rishikesh", "jayade");
    }

    
    //overloading main method.
    public static void main(String a, String b){
        System.out.println(a+" "+b);
    }


}
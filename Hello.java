class Hello
{

    public static void main(String args[])
    {
        int num = 10; // 4bytes
        byte num1 = 127; // -128 to 127 range similarly we have long,short.
        long l = 54334l;
        String nick_name = "rishi";
        String official_name = "rishi";
        System.out.println("Is nick_name and official_name variabl contain same address? "+(nick_name==official_name));
        //The values are stored in string constant pool and two variables contain same value then they both will have same address.
        


        float cgpa = 5.7f; //double is default due to which specify f to make it a float
        char t = 'T';
        //boolean b;

        System.out.println("Hello world!");
        char t1 = (char)(t+1);
        System.out.println(t1); //Output U


        int a = 30; 
        int b = 61;
        int result = (~a & b) | (a & ~b); //bitwise operator. ~a complement of a
        System.out.println(~a);
        System.out.println(~b);
        System.out.println(result);

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
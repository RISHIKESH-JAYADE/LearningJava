package Learning_Inheritance.calculator;

public class ScientificCalc extends AdvCalc  {
    
     public int power(int n1,int n2){
        int r=n1;
        for(int i=0;i<n2-1;i++){
            r = r*n1;
        }
        return r;
    }

    public int add (int n1,int n2){//method overriding
        //bitwise add : Calculate the carry and add it to the XOR of number.
        // carry calculation        XOR calculation
        // 3 n1    0011                    0011
        // 9 n2    1001                    1001
        //AND      0001            n1'     1010
//left shift       0010   -------> n2'     0010
                                
//     n1'&n2' = 0010       //left shift  n1"= 0100
//     n1'^n2' = 1000   -> //             n2"= 1000

//eventually if n1&n2=0, xor them to get the result. 
//recursion 
        System.out.println("bitwise add");
        if ((n1&n2)==0){
            return (n1^n2);
            
        }
        else{
            int x = n1^n2;
            int y = n1&n2;
            y = y<<1;
            return add(x,y);
        }
    }
}

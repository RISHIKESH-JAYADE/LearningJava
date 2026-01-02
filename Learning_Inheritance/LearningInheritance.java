package Learning_Inheritance;

import Learning_Inheritance.calculator.AdvCalc;
import Learning_Inheritance.calculator.Calc;
import Learning_Inheritance.calculator.ScientificCalc;

public class LearningInheritance {
    
    public static void main(String args[]){
        Calc c1 = new Calc();
        int r1 = c1.add(12, 8);
        System.out.println("12 + 8 = "+r1);
        int r2 = c1.sub(12, 8);
        System.out.println("12 - 8 = "+r2);
        
        //Advance calculator is an extended version of basic calculator
        //object of AdvCalc will have methods from basic Calc as calc is inherited by advCalc
        AdvCalc ad = new AdvCalc();
        int a1 = ad.add(30,32);
        System.out.println("30 + 32 = "+a1);
        int a2 = ad.sub(34, 12);
        System.out.println("34 + 12 = "+a2);
        int a3 = ad.multi(3, 10);
        System.out.println("3 x 10 = "+a3);
        int a4 = ad.mod(10, 3);
        System.out.println("10 mod 32 = "+a4);

        //Multi Level inheritance

        ScientificCalc sc = new ScientificCalc();
        int s1 = sc.add(12, 8); //method overiding
        System.out.println("12 + 8 = "+s1);
        int s2 = sc.multi(3, 2);
        System.out.println("3 x 2 = "+s2);
        int s3 = sc.power(3, 3);
        System.out.println("3 pow 3 = "+s3);
        
        
    }
}

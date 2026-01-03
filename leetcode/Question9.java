package leetcode;

class Question9 {

    public static boolean isPalindrome(int x) {
        
        if(x<0){
            return false;
        }
        else{
            String str = Integer.toString(x);
            System.out.println(str);
            String[] str1;
            for(int i=str.length()-1,j=0;((i>-1)&&(j<str.length()));i--,j++){
                if(str.charAt(j)!=str.charAt(i)){
                    return false;
                }
            }

            return true;

        }
    }

    public static int reverseInt(int x){
        int num = x;
        int lastDigit;
        int newNum=0;
        while(num>0){
            lastDigit = num%10;
            num = num/10;
            newNum= newNum*10+lastDigit;
            //System.out.print(lastDigit);
        }
        //if we compare the new number with the original num we can check if they are palindrome.
        return newNum;

    }

    public static void main(String[] args) {

        boolean result = Question9.isPalindrome(-11221);
        System.out.println(result);
        System.out.println(Question9.reverseInt(123456));
        //System.out.println(z);
    }
    
}

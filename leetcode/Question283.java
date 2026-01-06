package leetcode;
public class Question283 {

    public static int[] moveZeroes(int[] nums) {

        //Logic: Create a new array and initialize its all elements to 0;
        //iterate over the array and copy all the non-zero elements to new array.
        int [] newNums = new int[nums.length];
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                newNums[j]=nums[i];
                j++;
            }
        }
        return newNums;
        
    }


    public static void moveZeroesInPlace(int[] nums){
        //Logic: maintain 2 pointers(i,j) starting at the first element of the array.
        //iterate over the array completely with pointer i.
        //If we encounter zero do nothing, else copy the pointer i value to pointer j.
        //replace all the remaining values with zero. 
        int i=0,j=0;
        while(i<nums.length){
            if(nums[i]!=0){
                nums[j]=nums[i];
                j++;
            }
            i++;
        }
        while(j<i){
            nums[j]=0;
            j++;
        }

    }

    public static void main(String[] args) {
        
        int [] numbers = {0,1,0,3,12};

        // int[] result = Question283.moveZeroes(numbers);
        // for(int value: result){
        //     System.out.println("value: "+value);
        // }

        Question283.moveZeroesInPlace(numbers);
        for(int value: numbers){
            System.out.println(value);
        }
        
     }
    
}

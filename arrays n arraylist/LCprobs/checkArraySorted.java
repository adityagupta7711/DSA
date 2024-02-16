package LCprobs;

public class checkArraySorted {
    //1752. Check if Array Is Sorted and Rotated
    public static void main(String[] args) {
        int[] nums={1,2,3}; //2,1,3,4 __ 3,4,5,1,2 __ 1,2,3
        System.out.println(check(nums));
    }
    public static boolean check(int[] nums) {
        int count=0;
        for ( int i=0; i<nums.length-1; i++){
            if(nums[i] > nums[i+1])
            count++;
        }
        if (count==0)
        return true;
        else if( count > 1)
        return false;
        else if (nums[0]>= nums[nums.length-1])
        return true;
        else 
        return false;
}
}

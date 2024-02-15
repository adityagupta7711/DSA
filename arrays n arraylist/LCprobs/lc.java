package LCprobs;
import java.util.Arrays;

public class lc {
    // 1929. Concatenation of Array
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }
    
    public static int[] getConcatenation(int[] nums) {
        int[] ans= new int[2*nums.length];
        for (int i = 0; i < nums.length; i++) {
            // i--> 0,1,2
            ans[i]= nums[i];
            // i(0,1,2)+ 3= 3,4,5
            ans[i+ nums.length]= nums[i];
        }
        return ans;
    }
}

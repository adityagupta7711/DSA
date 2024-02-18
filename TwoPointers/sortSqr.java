package TwoPointers;

import java.util.Arrays;

public class sortSqr {
    public static void main(String[] args) {
        int [] arr= {-10, -8, 0, 2, 6,9};
        System.out.println(Arrays.toString(sortSquares(arr)));
    }
    static int[] sortSquares(int [] arr){
        int left =0;
        int right= arr.length-1;
        int[] ans= new int[arr.length];
        int k=0;
        while (left <=right) {
            if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                ans[k++]= arr[left] * arr[left];
                //or k++;
                left++;
            } else{
                ans[k++]= arr[right] * arr[right];
                right--;
            }
        }
        reverse(ans);
        return ans;
    }
    static void reverse(int[] arr) { //reversal
        int start = 0;
        int end = arr.length-1; //index value

        while (start < end) {
            // swap fn
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}

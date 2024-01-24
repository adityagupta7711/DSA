import java.util.*;

public class searchInArray {

    
    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };
        int target = 56;
        int[] ans = search(arr,target); // format of return value {row, col}
        System.out.println(Arrays.toString(ans));

      //  System.out.println(max(arr)); this to print max element in the array

       // System.out.println(Integer.MIN_VALUE); used to get the min value int
    }

    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col}; // since not declared at main int [][], has to be declared here or error
                }
            }
        }
        return new int[]{-1, -1};
    }

    static int max(int[][] arr) { // logic to print max element in the array
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) { //for each loop
            for (int element : ints) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }
}


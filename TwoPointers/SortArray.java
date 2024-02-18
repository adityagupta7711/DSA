package TwoPointers;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int []arr= {1,0,1,0,1,0,1,0};
        System.out.println(Arrays.toString(arr));
        sortZeroesandOne(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sortZeroesandOne(int [] arr){
        int start=0; int end = arr.length-1;
        //optimised two ptr method
        while(start<end){
        if (arr[start]==1 && arr[end]==0) {
            swap (arr, start, end);
            start++;
            end--;
        } if(arr[start]==0){
            start++;
        } if(arr[end]==1) {
            end--;
        }
    }
        
        // int zeroes= 0;
        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i]==0){
        //         zeroes++;
        //     }
        // }
        // for (int i = 0; i < arr.length; i++) {
        //     if(i< zeroes){
        //         arr[i]=0;
        //     } else{
        //         arr[i]=1;
        //     }
        // }
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

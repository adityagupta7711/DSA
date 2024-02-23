package recursion.Sorting;

import java.util.*;

public class quickSort {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr = Arrays.asList(new Integer[] {4, 6, 2, 5, 7, 9, 1, 3});
        int n = arr.size();
       
        arr = Solution.quickSort(arr);
        System.out.println("After insertion sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
    }
    
    class Solution{
        static int partition(List<Integer> arr, int low, int high){
            int pivot= arr.get(low);
            int i= low;
            int j= high;
            while (i < j){
                while ( arr.get(i) <= pivot && i <= high -1){
                    i++;
                }
                while ( arr.get(j) > pivot && j>= low +1){
                    j--;
                }
                if (i < j) {
                    int temp = arr.get(low);
                    arr.set(j, arr.get(j));
                    arr.set(j, temp);                    
                }                
            }
            int temp= arr.get(low);
            arr.set(low, arr.get(j));
            arr.set(j, temp);
            return j;
        }
        static void qs( List<Integer> arr, int low, int high){
            if (low < high) {
                int pIndex= partition(arr, low, high);
                qs(arr, low, pIndex-1);
                qs(arr, pIndex+1, high);
            }
        }
        public static List<Integer> quickSort(List<Integer> arr) {
            qs(arr, 0, arr.size()-1);
            return arr;
        }
    }
}

/*
 * package com.kunal.sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
//        sort(arr, 0, arr.length - 1);
//        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
    }

    static void sort(int[] nums, int low, int hi) {
        if (low >= hi) {
            return;
        }

        int s = low;
        int e = hi;
        int m = s + (e - s) / 2;
        int pivot = nums[m];

        while (s <= e) {

            // also a reason why if its already sorted it will not swap
            while (nums[s] < pivot) {
                s++;
            }
            while (nums[e] > pivot) {
                e--;
            }

            if (s <= e) {
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }

        // now my pivot is at correct index, please sort two halves now
        sort(nums, low, e);
        sort(nums, s, hi);
    }
}
 */
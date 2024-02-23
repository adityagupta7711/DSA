package recursion.Sorting;

import java.util.Arrays;


public class MergeInPlace {

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        mergeSortInPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    
    static void mergeSortInPlace(int[] arr, int s, int e) {
        if (e - s==1) {
            return;
        }

        int mid = (s + e) / 2;

        mergeSortInPlace(arr, s, mid);
        mergeSortInPlace(arr, mid, e);

        mergeInPlace(arr, s, mid, e);
    }

    private static void mergeInPlace(int[] arr, int s, int m, int e) {
        int[] mix = new int[e - s];

        int i = s;
        int j = m;
        int k = 0;

        while (i < m && j < e) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        // it may be possible that one of the arrays is not complete
        // copy the remaining elements
        while (i < m) {
            mix[k] = arr[i];
            i++;
            k++;
        }

        while (j < e) {
            mix[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < mix.length; l++) {
            arr[s+l] = mix[l];
        }
    }
}

/*
 * striver
 * static int partition(List<Integer> arr, int low, int high) {
 * int pivot = arr.get(low);
 * int i = low;
 * int j = high;
 * 
 * while (i < j) {
 * while (arr.get(i) <= pivot && i <= high - 1) {
 * i++;
 * }
 * 
 * while (arr.get(j) > pivot && j >= low + 1) {
 * j--;
 * }
 * if (i < j) {
 * int temp = arr.get(i);
 * arr.set(i, arr.get(j));
 * arr.set(j, temp);
 * }
 * }
 * int temp = arr.get(low);
 * arr.set(low, arr.get(j));
 * arr.set(j, temp);
 * return j;
 * }
 * 
 * static void qs(List<Integer> arr, int low, int high) {
 * if (low < high) {
 * int pIndex = partition(arr, low, high);
 * qs(arr, low, pIndex - 1);
 * qs(arr, pIndex + 1, high);
 * }
 * }
 * public static List<Integer> quickSort(List<Integer> arr) {
 * // Write your code here.
 * qs(arr, 0, arr.size() - 1);
 * return arr;
 * }
 * }
 * 
 * public class tUf {
 * public static void main(String args[]) {
 * List<Integer> arr = new ArrayList<>();
 * arr = Arrays.asList(new Integer[] {4, 6, 2, 5, 7, 9, 1, 3});
 * int n = arr.size();
 * System.out.println("Before Using insertion Sort: ");
 * for (int i = 0; i < n; i++) {
 * System.out.print(arr.get(i) + " ");
 * }
 * System.out.println();
 * arr = Solution.quickSort(arr);
 * System.out.println("After insertion sort: ");
 * for (int i = 0; i < n; i++) {
 * System.out.print(arr.get(i) + " ");
 * }
 * System.out.println();
 * }
 * 
 */
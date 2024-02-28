package recursion;

import java.util.ArrayList;

public class findTarget {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,4,5,6};
        
        // System.out.println(find(arr, 4, 0));
        // System.out.println(findIndex(arr, 4, 0));
        // System.out.println(findIndexLast(arr, 4, arr.length-1));
        // findAllIndex(arr, 4, 0);
        // System.out.println(list);
        // ArrayList<Integer> list= new ArrayList<>(); can declare it here as well or do it like below
        ArrayList<Integer> ans= findAllIndex(arr, 4, 0, new ArrayList<>());
        System.out.println(ans);
    }
    static boolean find(int []arr, int target, int index){
        if (index==arr.length) {
            return false;
        }
        return arr[index]==target || find(arr, target, index+1);
    }
    static int findIndex(int []arr, int target, int index){
        if (index==arr.length) {
            return -1;
        }
        if (arr[index]==target) {
            return index;
        }
        else{
            return findIndex(arr, target, index+1);} 
    }
    static int findIndexLast(int []arr, int target, int index){
        if (index==-1) {
            return -1;
        }
        if (arr[index]==target) {
            return index;
        }
        else{
            return findIndexLast(arr, target, index-1);} 
    }
    // 1 way
    static ArrayList<Integer> list= new ArrayList<>();
    static void findAllIndex(int [] arr, int target, int index){
        if (index== arr.length) {
            return;
        }
        if (arr[index]==target) {
            list.add(index);
        } 
        findAllIndex(arr, target, index+1);
    }
    //2nd way in the argument
    static ArrayList<Integer> findAllIndex(int [] arr, int target, int index, ArrayList<Integer> list){
        if (index==arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findAllIndex(arr, target, index+1, list);
    }

    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index){
        ArrayList<Integer> list= new ArrayList<>(); // creates new list for every fn call
        if (index == arr.length) {
            return list;
        }

        // this will contain answer for that function call only
        if (arr[index]== target) {
            list.add(index);

        }
        ArrayList<Integer> ansFromBelowCalls= findAllIndex2(arr, target, index+ 1);
        list.addAll(ansFromBelowCalls);
        return list;
    }

}

import java.util.Arrays;
import java.util.List;

public class mustKnow {
    public static void main(String[] args) {
        String [] arr={"chicken", "bacon", "avo"};
        List<String> list= Arrays.asList(arr);
        for (String s : list) {
            System.out.print(s + "_");
        }

        int[] array= new int[5];
        Arrays.fill(array, 100);
        for (int i : array) {
            System.out.print(i+" ");
        }
        //  Arrays.copyOf(null, 0)
        //Arrays.equals(arr1, arr2) are the contents same, true or false
        //lexicographiacally check krne ke liye Arrays.compare()
        //Arrays.sort()
        //Arrays.binarysearch() at what index is the elemnt in the array
    }
}

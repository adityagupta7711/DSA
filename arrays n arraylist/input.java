import java.util.*;;
public class input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // array of primitives
        int[] arr = new int[4];
        // arr[0] = 23;
        // arr[1] = 45;
        // arr[2] = 233;
        // arr[3] = 543;
        // arr[4] = 3;
        // [23, 45, 233, 543, 3]
        // System.out.println(arr[3]);

        // // input using for loops
        for (int i = 0; i < arr.length; i++) {
        
            arr[i] = in.nextInt();
           

        }
       System.out.println(Arrays.toString(arr)); // ez way to print directly the array{it has for loop inside it} and it adds the [] brackets and , comma on its own
       

//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
          // enhanced for loop-- for every element in array, print the element
          
//        for(int num : arr) { // for every element in array, print the element
//            System.out.print(num + " "); //  here num represents element of the array
//        }

//        System.out.println(arr[5]); // index out of bound error as index for 5 elements till 4

        // // array of objects
        // String[] str = new String[4];
        // for (int i = 0; i < str.length; i++) {
        //     str[i] = in.next();
        // }

        // System.out.println(Arrays.toString(str));

        // // modify
        // str[1] = "kunal";

        // System.out.println(Arrays.toString(str));
        in.close();
    }
}
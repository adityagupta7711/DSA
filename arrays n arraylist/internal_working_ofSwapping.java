import java.util.Arrays;

public class internal_working_ofSwapping {
    public static void main(String[] args) {
        int[] arr= {1,3,5,7,9};
        change(arr);
        System.out.println(Arrays.toString(arr));
        //----//
        String man= "Iron man";
        System.out.println(man);
        //----
        int a= 10;
        int b=20;
        swap(a,b);
        System.out.println(a+"   "+b);
        //-----
        String name="Kunal kushwaha";
        changeName(name);
        System.out.println(name);
    }
/* no pass by reference in java
 * primtives: int, short, char, byte etc---> just passing value
 * objects & stuff--- passing values of the reference
 */
    static void change(int[] nums){
        nums[0]= 77; // if you make a change to the object via this ref variable, same object will be changed
    }

    static void greet(String naam){
        System.out.println(naam);
    }

    static void swap(int a, int b){
        int temp = a;
        a=b;
        b= temp;
    }
    static void changeName(String naam){
        naam="raman raj"; //here we creating a new object so no change, also strings are immutable(final classes)
    }
}

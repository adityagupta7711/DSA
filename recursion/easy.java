package recursion;

/**
 * easy
 */
public class easy {

    public static void main(String[] args) {
        rev(5);
    }
    static void rev(int n){
        if (n==0) {
            return;
        }
        //both 
        System.out.println(n);//54321
        rev(n-1);
        System.out.println(n);//12345
    }
}
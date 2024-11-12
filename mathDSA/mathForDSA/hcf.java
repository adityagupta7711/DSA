package mathDSA.mathForDSA;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;

public class hcf {
    public static void main(String[] args) {
        int a = 15;
        int b = 20;

        List<Integer> result = lcmAndGcd(a, b);
        System.out.println("LCM: " + result.get(0));
        System.out.println("GCD: " + result.get(1));
        //System.out.println(result);
    }
 public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    // Function to calculate LCM
    public static int lcm(int a, int b, int gcd) {
        return (a * b) / gcd;
    }

    // Function to compute both LCM and GCD
    public static List<Integer> lcmAndGcd(int a, int b) {
        int gcdValue = gcd(a, b);
        int lcmValue = lcm(a, b, gcdValue);

        List<Integer> result = new ArrayList<>();
        result.add(lcmValue); // Add LCM to the list
        result.add(gcdValue); // Add GCD to the list

        return result;
    }

    // Main method to test the function

}

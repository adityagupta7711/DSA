package mathDSA.mathForDSA;

import java.util.*;

public class PrintAllDivisors {
    public static void main(String[] args) {
        printDiv(36);

    }

    static void printDiv(int n) {
        ArrayList<Integer> ls = new ArrayList<>();
        // O(sqrt (n))
        for (int i = 1; i * i <= n; i++) { // or use n*n for lesser time complexity as math.sqrt is a method
            if (n % i == 0) {
                ls.add(i);
                if ((n / i) != i) {
                    ls.add(n / i);
                }
            }
        } // O(n log n)-->
          // O(no. of factors * log (no. of factors)): n is the number of factors
        Collections.sort(ls);
        // O ( number of factors)
        System.out.println(ls);
    }
    /*
     * gfg question -Sum of all divisors from 1 to n
     * 
     * static long sumOfDivisors(int N){
     * // code here
     * long sum = 0;
     * //iterating frm 1 to N
     * for (int i=1; i<= N; i++){
     * //calculating and accumulating the sum of divisors
     * sum += (N / i)* i;
     * }
     * return sum;
     * }
     */
}
package mathDSA.mathForDSA;

import java.util.Scanner;

public class gcdLcm {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();

        int on1 = n1;
        int on2 = n2;
        while (n1 % n2 != 0) {
            int rem = n1 % n2;
            n1 = n2;
            n2 = rem;
        }
    
        int gcd = n2;
        int lcm = (on1 * on2) / gcd;
        System.out.println(gcd);
        System.out.println(lcm);
        s.close();
    }

    static Long gcd(Long a, Long b) {
        if (a == 0)
            return b;

        return gcd(b % a, a);
    }

    static Long[] lcmAndGcd(Long A, Long B) {

        Long[] arr = new Long[2];

        Long g = gcd(A, B); // gcd of two numbers.
        Long l = (A * B) / g; // product of 2 numbers divided by their gcd gives their lcm.

        arr[0] = l;
        arr[1] = g;

        return arr;
    }
}

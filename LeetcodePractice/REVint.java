package LeetcodePractice;

//question 7

public class REVint {
    public static void main(String[] args) {
        System.out.println(revers(-5430));

        String name = "Rahul";
        Integer a= 4344343;
        int code = a.hashCode();
        System.out.println(code);
    }

    public static int revers(int x) {
        // int num = Math.abs(x);

        // int rev = 0;

        // while (num != 0) {
        // int lastdgt = num % 10;

        // // overflow check

        // if (rev > (Integer.MAX_VALUE - lastdgt) / 10) {
        // return 0;
        // }
        // Underflow check
        // if (rev < (Integer.MIN_VALUE + ld) / 10) {
        // return 0; // If underflow occurs, return 0
        // } though not necessarily required but a good practise to include it..
        // rev = rev * 10 + lastdgt;
        // num = num / 10;
        // }
        // return (x < 0) ? (-rev) : rev;

        // ----------------other approach [0 ms ]
        int rev = 0;
         
        while (x != 0) {
            int digit = x % 10;
            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
                return 0;// handle overflow
            }
            rev = (rev * 10) + digit;
            x /= 10;
        }
        return rev;
    }
}

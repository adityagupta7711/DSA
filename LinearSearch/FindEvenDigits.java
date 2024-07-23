public class FindEvenDigits {
    // LC 1295
    public static void main(String[] args) {
        int[] nums = { 12, 345, 2, 6, 7896 };
        System.out.println("" + 345);
        System.out.println(findNumbers(nums));
        System.out.println(digits(0));
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    // count number of digits in a number
    static int digits(int num) {
        if (num < 0) {
            num *= -1;
        }
        if (num == 0) {
            return 1;
        }

        int count = 0;

        while (num > 0) {
            count++;
            num = num / 10; // or num/=10
        }
        return count;
    }

    // function to check even number or not
    static boolean even(int num) {
        int numberOfDigits = digits(num);
        // if (numberOfDigits % 2==0) {
        // return true;
        // }
        // return false;
        return numberOfDigits % 2 == 0; // returns true if this statement is is equal to 0
    }
    static int digits2(int num){
        return (int)(Math.log10(num)) + 1;
    }

}

/*
 * 
 * String.valueOf(number) (my preference)
 * "" + number (I don't know how the compiler handles it, perhaps it is as
 * efficient as the above)
 * Integer.toString(number)
 */
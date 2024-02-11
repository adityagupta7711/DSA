package patterns;

public class answers {
    public static void main(String[] args) {
        pattern3(4);
    }

    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
        static void pattern4(int n) {
            for (int row = 1; row <= n; row++) {
                for (int col = 1; col <= row; col++) {
                    System.out.print(col);
                }
                System.out.println();
            }
    
    }
    static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = n-row; col >= 0; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

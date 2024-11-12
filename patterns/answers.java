package patterns;

public class answers {
    public static void main(String[] args) {
        pattern30(4);
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
            for (int col = n - row; col >= 0; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int totalColsInRow = row > n ? 2 * n - row : row;
            for (int col = 0; col < totalColsInRow; col++){
                System.out.print("$ ");
            }
            System.out.println();
        }
    }

    static void pattern30(int n){
        for (int row= 1; row <=n ; row++){
            for (int space=0; space < n-row; space++){
                System.out.print("  ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col+" ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
       
    }

}

package patterns;

public class triangle1 {
    public static void main(String[] args) {
        pattern1();
    }

    static void pattern1() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

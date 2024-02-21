package recursion.patterns;

public class triangle {
    public static void main(String[] args) {
        triangl(4, 0);
    }

    static void triangl(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
        //    System.out.print("*");
            triangl(r, c + 1);
            System.out.print("*");
        } else {
        //    System.out.println();
            triangl(r - 1, 0);
            System.out.println();
        }
    }
}

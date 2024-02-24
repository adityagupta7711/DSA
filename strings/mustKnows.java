package strings;

import java.util.Arrays;

public class mustKnows {
    public static void main(String[] args) {
        String name = "Bro";
        // boolean result= name.equals("Bro");
        // int result= name.length();
        // char result= name.charAt(0);
        // int result=name.indexOf("o");
        // name.isEmpty() checks whether empty or not, tru false
        // name.trim() trims the blankspaces
        // name.replace('o', 'a')

        // // System.out.println(result);
        // String s = "abcde";
        // char ch = s.charAt(3); // here we get char '2'
        // int num = ch - '0'; // to convert the char at index 3 into int we use this
        // char c = (char) ('a' + num); // This will add int num to a which results in c

        // System.out.println(c);
        String str = "Welcome   to 420 Gang ";
        String[] Str = str.trim().split("\\s+"); // .trim() will remove spaces from first and last
        System.out.println(Arrays.toString(Str));
        // "\\s": This represents a whitespace character in regular expressions. It
        // includes spaces, tabs, and newline characters.
        // +: This is a quantifier in regular expressions that means "one or more
        // occurrences of the preceding element". So \\s+ means one or more whitespace
        // characters.
    }
}

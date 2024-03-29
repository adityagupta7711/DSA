import java.util.*;
public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Kunal";
        char target = 'm';
       System.out.println(search2(name, target));
      System.out.println(Arrays.toString(name.toCharArray()));
    }

    static boolean search2(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        for(char ch : str.toCharArray()) { //str.toCharArray--> Converts this string to a new character array
            if (ch == target) {
                return true;
            }
        } 
        return false;
    }

    static boolean search(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) { //returns the char value at index i
                return true;
            }
        }
        return false;
    }
}
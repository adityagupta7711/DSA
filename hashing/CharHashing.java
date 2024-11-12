package hashing;
import java.util.*;

public class CharHashing {
    public static void main(String[] args) {
        /*
         * In order to map the characters we need to use the ASCII values of the respective characters. The ASCII value of lowercase a is 97. So, if we write int x = ‘a’, it will typecast the character, ‘a’, into the ASCII value, 97, and store it in the variable x instead of throwing an error. So, similarly, if we write hash[‘a’], it will signify hash[97]. 
         * 
         * 
         */
        Scanner sc = new Scanner(System.in);

        String s;
        s = sc.next();

        //precompute:
        int[] hash = new int[26];   //int[] hash = new int[256]; for both upper and lowercase
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i) - 'a']++;
            /*
             * corresponding value = given character - 'a'

For example, if the given character is ‘f’, we will get the value as (‘f’ - ‘a’) = (102-97) = 5.  Here, we can easily observe that the maximum value can be 25. 

So, for character hashing in this case, we need a hash array of size 26. And while pre-storing we will do hash[s[i]-’a’] += 1 instead of hash[arr[i]] += 1, and while fetching we will do hash[character-’a’] instead of hash[number]. The rest of the methods will be as same as in the case of number hashing.
             */
        }

        int q;
        q = sc.nextInt();
        while (q-- > 0) {
            char c;
            c = sc.next().charAt(0);
            // fetch:
            System.out.println(hash[c - 'a']);
        }
        

    }
}

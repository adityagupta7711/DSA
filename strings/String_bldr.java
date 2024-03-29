package strings;
import java.util.Arrays;

public class String_bldr {
    public static void main(String[] args) {

    //    String series = "";
//        for(int i=0; i< 26 ; i++){
//            char ch = (char) ('a' + i);
//            series = series + ch;
//        }
//        System.out.println(series);

//  If we run above loop then the objects series will be created again and again as we know we can't modify the string
//  for 1st iteration it will be ""+'a' = "a"
//  2nd iteration "a"+ 'b' = "ab"
//  Likewise these are created separately as we cant modify the string
//  So we use String builder to modify the string

        StringBuilder sb = new StringBuilder();
        for(int i=0; i< 26 ; i++){
            char ch = (char) ('a' + i);
            sb.append(ch);
        }
        System.out.println(sb.toString());
        // we can do more operation on string builder
        System.out.println(sb.deleteCharAt(0));
        System.out.println(sb.indexOf("e"));



//  ----------------------------------------String Methods--------------------------------------------------------------
        String sen = "Lmao there's been an old guy who used to give za for free";
        System.out.println(Arrays.toString(sen.toCharArray()));
        System.out.println(sen.toUpperCase());
        System.out.println(Arrays.toString(sen.split(" ")));    // it will cut where the spaces are present
        String name = "          chicony         ";
        System.out.println(name.strip());

        String str= "   Now this   is     some    good thing  ";
        String [] Str= str.trim().split("\\s+");    //It will first trim the str then split will split the words and store the substrings into string array
        System.out.println(Arrays.toString(Str));
        // \\s: This represents a whitespace character in regular expressions. It includes spaces, tabs, and newline characters.
        //+: This is a quantifier in regular expressions that means "one or more occurrences of the preceding element". So \\s+ means one or more whitespace characters.
    }

}



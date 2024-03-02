package recursion.Subset;

import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args) {
       
        System.out.println( subseqReturn("", "abc"));
    }
    static void subseq(String p, String up){
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch= up.charAt(0);
        subseq(p, up.substring(1));// up.substring creating a new obj cuz string are immutable......       if this line first-- c b bc  a ac ab abc
        subseq( p + ch, up.substring(1));// p+ch creating a new obj  ........  if this first toh seq of output abc ab ac a bc b c
        
    }
    static ArrayList<String> subseqReturn(String p, String up /*, ArrayList<> */){ // you can pass arraylist in the argument, easy approach, make one AList outside and then just keep adding to it
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch= up.charAt(0);
        ArrayList<String> left= subseqReturn( p + ch, up.substring(1));
        ArrayList<String> right= subseqReturn(p, up.substring(1));// if this line first-- c b bc  a ac ab abc
        // if this first toh seq of output abc ab ac a bc b c
        left.addAll(right);
        return left;
    }
}


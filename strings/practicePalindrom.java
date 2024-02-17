package strings;

public class practicePalindrom {
    public static void main(String[] args) {
        String str="abcdcba";
        System.out.println(checkPalindrom(str));

    }
    public static boolean checkPalindrom(String alphabets){
        //edge case
        if (alphabets==null || alphabets.length()==0) {
            return true;
        }
        alphabets=alphabets.toLowerCase();
        for (int i = 0; i < alphabets.length(); i++) {
            char start= alphabets.charAt(i);
            char end= alphabets.charAt(alphabets.length()-1-i);

            if (start!=end){
                return false;
            }
        }
        return true;
    }
}

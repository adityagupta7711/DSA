package strings;

public class Main {
    public static void main(String[] args) {
        int num = 10;
        System.out.println(num);
        num = 5;
        System.out.println(num);
        String name = "Kunal Kushwaha";
        System.out.println(name);
        String x= new String("adi");
        String y= new String("adi");
        System.out.println(x==y);// creating these outside the pool in heap

        String a = "Kunal";
        System.out.println(a);
        a = "Kushwaha"; // did not change 'kunal', created a new obj--kushwaha
        System.out.println(a);
    }
}

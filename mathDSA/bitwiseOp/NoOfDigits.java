package mathDSA.bitwiseOp;

public class NoOfDigits {
    public static void main(String[] args) {
    int n= 10;
    System.out.println((int)Math.log(n));   //takes the int value of log result cuz it's in double
    int b= 2;
    int ans = (int)(Math.log(n)/Math.log(b)) +1;
    System.out.println(ans);
    }   

}

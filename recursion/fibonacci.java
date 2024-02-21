package recursion;
public class fibonacci {
public static void main(String[] args) {
    int ans= fibo(4);
    System.out.println(ans);
    System.out.println(fibFormula(50));
}
static int fibFormula(int n){
    return (int) ( Math.pow( ( (1 + Math.sqrt(5) ) /2 ) , n ) / Math.sqrt(5) );
    // Use long instead of int
}
    static int fibo(int n){
        //base condition
        if (n<2){
            return n;
        }
        return fibo(n-1)+ fibo(n-2); //not tail recursion
    }
}
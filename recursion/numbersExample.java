package recursion;

public class numbersExample {
    public static void main(String[] args) {
        //write a function that takes in a number and prints it
        //print first 5 numbers
        print1(1);
        
    }
    static void print1(int n){
        if (n==5){
            System.out.println(5);
            return;
        }
        System.out.println(n);
        //this is called tail recursion
        //this is the last function
        print1(n+1);
    }
    }
//     static void print1(int n){
//         System.out.println(n);
//         print2(2);
//     }
//     static void print2(int n){
//         System.out.println(n);
//         print3(3);
//     }
//     static void print3(int n){
//         System.out.println(n);
//         print4(4);
//     }
//     static void print4(int n){
//         System.out.println(n);
//         print5(5);
//     }
//     static void print5(int n){
//         System.out.println(n);
// }



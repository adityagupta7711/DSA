package LCprobs;

/**
 * LC.1672---richestCustomerWealth
 */
public class richestCustomerWealth {

    public static void main(String[] args) {
        int[][] accounts={{1,2,3}, {3,2,1}};
        int ans= maximumWealth(accounts);
        System.out.println(ans);
    }

    public static int maximumWealth(int[][] accounts) {
        int sum1 = 0;
        for (int i = 0; i < accounts.length; i++) {
            int sum2 = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum2 += accounts[i][j];
            }
            sum1 = Math.max(sum1, sum2);
        }
        return sum1;
    }
}

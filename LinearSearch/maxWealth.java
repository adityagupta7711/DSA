public class maxWealth {

// Leetcode question number 1672(Richest customer wealth)
    public static void main(String[] args) {
        
    }

    public int maxinmumWealth(int [][] accounts){
        //person = rol
        //account= col
        int ans= Integer.MIN_VALUE;
        for (int[] account2 : accounts) {
            //when you start a new col, take a new sum for that row
            int sum=0;
            for (int element : account2) {
                sum+= element;
            }
            // now we have sum of accounts of person
            // check with overall ans
            if (sum> ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
/* .......normal for loop--->

 *  for (int person = 0; person < accounts.length; person++) {
            //when you start a new col, take a new sum for that row
            int sum=0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum+= accounts[person][account];
            }
 */
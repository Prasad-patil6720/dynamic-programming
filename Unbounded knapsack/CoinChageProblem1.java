public class CoinChageProblem1 {

    public static int coinChangeProblem(int[] coin,int sum){
        int[][] dp=new int[coin.length+1][sum+1];

        //* initialization */

        for (int i = 0; i < coin.length+1; i++) {
            for (int j = 0; j < sum+1; j++) {
                if(i==0){
                    dp[i][j]=0;
                }
                if(j==0){
                    dp[i][j]=1;
                }
            }
        }


        //* fill the tabel */
        for (int i = 1; i < coin.length+1; i++) {
            for (int j = 1; j < sum+1; j++) {
                if(coin[i-1]<=j){
                    dp[i][j]=dp[i-1][j]+dp[i][j-coin[i-1]];
                }
                else if(coin[i-1]>j){
                    dp[i][j]=dp[i-1][j];
                }

            }
        }
            return dp[coin.length][sum];
    }


    public static void main(String[] args) {
        System.out.println(coinChangeProblem(new int[]{1,2,3}, 5));
    }
}

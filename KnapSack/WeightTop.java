public class WeightTop {

    public static int knapSack(int[] wt,int[] val,int w ,int n) {
            int[][] dp=new int[n+1][w+1];
        //* initialization */

        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < w+1; j++) {
                if(i==0||j==0){
                    dp[i][j]=0;
                }
            }
        }


        //* top down  */
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < w+1; j++) {
                if(wt[i-1]<=j){
                    dp[i][j]=Math.max(val[i-1]+dp[i-1][j-wt[i-1]], dp[i-1][j]);
                }
                else if(wt[i-1]>j){
                    dp[i][j]=dp[i-1][j];
                }
            }
        }


        return dp[n][w];
        
    }
    
    public static void main(String[] args) {
        int wt[]={1,3,6,4};
        int val[]={1,4,5,7};
        int n=4;
        int w=10;
        System.out.println(knapSack(wt, val, w, n));
    }
}

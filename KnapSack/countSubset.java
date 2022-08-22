public class countSubset{

    public static int knapSack(int[] arr,int sum){
        int n=arr.length+1;
        int m=sum+1;
        int[][] dp=new int[n][m];

        //* initialization */
        for(int i=0;i<n;i++){
            for (int j = 0; j < m; j++) {
                if(i==0){
                    dp[i][j]=0;
                }
                if(j==0){
                    dp[i][j]=1;
                }
            }
        }


        //* dynaic programming */
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(arr[i-1]<=j){
                    dp[i][j]=dp[i-1][j-arr[i-1]]+dp[i-1][j];
                }
                else if(arr[i-1]>j){
                    dp[i][j]=dp[i-1][j];
                }
            }
            
        }

        return dp[arr.length][sum];
    }

    public static void main(String[] args) {
   System.out.println(knapSack(new int[]{2,3,5,6,8,10}, 10));
    }
}
public class Subset {
    
    public static boolean knapSack(int[] arr,int sum){
        int n=arr.length+1;
        int m=sum+1;
        boolean[][] dp=new boolean[n][m];

        //* initialization */
        for(int i=0;i<n;i++){
            for (int j = 0; j < m; j++) {
                if(i==0){
                    dp[i][j]=false;
                }
                if(j==0){
                    dp[i][j]=true;
                }
            }
        }


        //* dynaic programming */
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(arr[i-1]<=j){
                    dp[i][j]=dp[i-1][j-arr[i-1]]|| dp[i-1][j];
                }
                else if(arr[i-1]>j){
                    dp[i][j]=dp[i-1][j];
                }
            }
            
        }

        return dp[arr.length][sum];
    }
    public static void main(String[] args) {
        System.out.println(knapSack(new int[]{17,9,5,7,8,10}, 11));
    }
}

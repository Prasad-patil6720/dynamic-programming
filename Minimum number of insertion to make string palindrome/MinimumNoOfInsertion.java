public class MinimumNoOfInsertion{
    public static int lcs(char[] x,char[] y,int n,int m){
        int[][] dp=new int[n+1][m+1];

        //*initialization */
        for (int i = 0; i < n+1; i++) {
            dp[i][0]=0;
        }
        for (int j = 0; j < m+1; j++) {
            dp[0][j]=0;
        }

        //* fill the table */
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < m+1; j++) {
                if(x[i-1]==y[j-1]){
                    dp[i][j]=1+dp[i-1][j-1];
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }

        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < m+1; j++) {
               System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }

        return dp[n][m];
    }
    public static void main(String[] args) {
        String a="aebcbda";
        String b="adbcbea";
       

        char[] x=a.toCharArray();
        char[] y=b.toCharArray();
         int ans=lcs(x, y, a.length(), b.length());

         //* lcs */
        System.out.println(ans);

        //* number of insertion */
        //* deltion =a.length()- lcs (a,b,n,m) */
        int del=a.length()-ans;
        System.out.println("number of insertion is "+del);


       

    }

}
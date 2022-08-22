public class LongestRepetingSubSequence{

    public static int lcs(char[] x,char[] y,int n,int m){
        int[][] dp=new int[n+1][m+1];

        for (int i = 0; i <n+1; i++) {
            dp[i][0]=0;
        }
        for (int j = 0; j < m+1; j++) {
            dp[0][j]=0;
        }


        //* fill the table lcs+(i!=j) */

        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < m+1; j++) {
                if(x[i-1]==y[j-1] && i!=j){
                    dp[i][j]=1+dp[i-1][j-1];
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }

        return dp[n][m];
    }

    public static void main(String[] args) {
        String s="AABEBCDD";
        //* copy same string for both x and y */
        char[] x=s.toCharArray();
        char[] y=s.toCharArray();

        System.out.println(lcs(x,y,s.length(),s.length()));
    }

}
public class SequencePatternMatching{

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
                if(x[i-1]==y[j-1]){
                    dp[i][j]=1+dp[i-1][j-1];
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }

        return dp[n][m];
    }

    public static boolean sequenceMatching(char[] x,char[] y,int n,int m){

        int ans=lcs(x, y, n, m);
        if(ans==n){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        String a="AXY";
        String b="ADXCPY";

        char[] x=a.toCharArray();
        char[] y=b.toCharArray();
        System.out.println(sequenceMatching(x, y, a.length(), b.length()));
    }

}
import java.util.Arrays;

public class LongestCommonSubstring{

    public static int lcs(char[] x,char[] y,int n,int m){
        int[][] dp=new int[n+1][m+1];
        int max=0;
      //*initialization */
      for (int i = 0; i < n+1; i++) {
        for (int j = 0; j < m+1; j++) {
            if(i==0|| j==0){
                dp[i][j]=0;
            }
        }
      }

      //* fill the table */
      for (int i = 1; i < n+1; i++) {
        for (int j = 1; j < m+1; j++) {

            if(x[i-1]==y[j-1]){
                dp[i][j]=1+dp[i-1][j-1];
                if(dp[i][j]>max){
                    max=dp[i][j];
                }
            }else{
                dp[i][j]=0;
            }
        }
        
    }
    for (int i = 0; i < n+1; i++) {
        for (int j = 0; j < m+1; j++) {

        System.out.print(dp[i][j]+" ");
        }
        System.out.println();
    }
    return max;

    }

    public static void main(String[] args) {
        String a="abcde";
        String b="abfce";

        char[] x=a.toCharArray();
        char[] y=b.toCharArray();

        System.out.println(lcs(x, y, a.length(), b.length()));
    }

}
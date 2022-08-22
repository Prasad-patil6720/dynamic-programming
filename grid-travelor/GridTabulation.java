import java.util.Arrays;
public class GridTabulation {
    public static int gridTravelor(int n,int m){
        int[][] dp=new int[n+1][m+1];

        for (int[] is : dp) {
            Arrays.fill(is,0);
        }

    dp[1][1]=1;
    for (int i = 0; i <=n; i++) {
        for (int j = 0; j <=m; j++) {
            int current=dp[i][j];
            if(j+1<=n) dp[i][j+1]+=current;
            if(i+1<=n) dp[i+1][j]+=current;
        }
        
    }


    return dp[n][m];
        
    }
    public static void main(String[] args) {
       System.out.println(gridTravelor(4, 4));
    }
}

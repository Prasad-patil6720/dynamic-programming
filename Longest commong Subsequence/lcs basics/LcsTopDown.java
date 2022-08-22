public class LcsTopDown{

public static int lcs(char[] x,char[] y,int n,int m){
    int[][] dp=new int[n+1][m+1];

    //*intitialization */
    for(int i=0; i<n+1;i++){
        for(int j=0;j<m+1;j++){
            if(i==0||j==0){
                dp[i][j]=0;
            }
        }
    }

    //* fill */
    for(int i=1; i<n+1;i++){
        for(int j=1;j<m+1;j++){
           if(x[i-1]==y[j-1]){
            dp[i][j]=1+dp[i-1][j-1];
           }else{
            dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
           }
        }
    }

    //*  print the dp */
    for(int i=0; i<n+1;i++){
        for(int j=0;j<m+1;j++){
          System.out.print(dp[i][j]+" ");
        }
        System.out.println();
    }
    return dp[n][m];
}
    public static void main(String[] args) {
        String s="abcdgh";
        String b="abedghr";
 
        char[] x=s.toCharArray();
        char[] y=b.toCharArray();

        System.out.println(lcs(x, y, s.length(), b.length()));
    }
}
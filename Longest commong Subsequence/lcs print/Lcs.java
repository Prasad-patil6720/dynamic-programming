public class Lcs{

public static int[][] lcs(char[] x,char[] y,int n,int m){
    int[][] dp=new int[n+1][m+1];

    //*inittializaiont */
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
    return dp;
}

public static void calculate(char[] x,char[] y,int n,int m){

    int[][] ans=lcs(x, y, n, m);
    for (int[] is : ans) {
        for (int i = 0; i <is.length; i++) {
            System.out.print(is[i]+" ");
        }
        System.out.println();
    }

    int i=n;
    int j=m;
    String str="";
    while(i>0 && j>0){
        if(ans[i-1]==ans[j-1]){
            str=str+y[j-1];
            System.out.println(str);
            i--;
            j--;
        }else{
            if(ans[i][j-1]>ans[i-1][j]){
                j--;
            }else{
                i--;
            }
        }
    }

    System.out.println(str);

}
    public static void main(String[] args) {
        String a="acbcf";
        String b="abcdaf";

        char[] x=a.toCharArray();
        char[] y=b.toCharArray();

        calculate(x,y,a.length(),b.length());
    }
}
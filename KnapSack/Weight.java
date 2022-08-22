import java.util.Arrays;

public class Weight{

    static int [][] dp=new int[5+1][10+1];
    static{
        for (int[] is : dp) {
            Arrays.fill(is, -1);
        }
    }

    public static int knapSack(int[] wt,int[] val,int w ,int n){

        //* base codtion  */
        if(n==0|| w==0){
            return 0;
        }

        if(dp[n][w]!=-1){
            return dp[n][w];
        }
        //* small hai to add karo */
        if(wt[n-1]<=w){
            return dp[n][w]=Math.max(val[n-1]+knapSack(wt, val, w-wt[n-1], n-1), knapSack(wt, val, w, n-1));
        }
        if(wt[n-1]>w){
            //* small nahi to add mat karot*/
            return dp[n][w]=knapSack(wt, val, w, n-1);

        }

        return 0;
    }
    public static void main(String[] args) {
        int wt[]={1,3,6,4};
        int val[]={1,4,5,7};
        int n=4;
        int w=10;
        System.out.println(knapSack(wt, val, w, n));
    }
}
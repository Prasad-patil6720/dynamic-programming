import java.util.ArrayList;
import java.util.Arrays;

public class MinimumSubsetSum{

    public static int minimunDiffernce(int[] arr,int n){
        int Range=0;
        for (int i : arr) {
            Range+=i;
        }
        System.out.println(Range);
        ArrayList<Integer> ans=new ArrayList<>();
        ans=subsetSum(arr,n,Range);

        System.out.println(ans);
        
        int min=Integer.MAX_VALUE;
        for (int i : ans) {
            min=Math.min(min,Range-(2*i));
        }
        return min;
    }
    public static ArrayList<Integer> subsetSum(int[] arr, int n, int range) {
        boolean[][] dp=new boolean[n+1][range+1];

    for (boolean[] bs : dp) {
        Arrays.fill(bs, false);
    }

        //* initialization */
        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < range+1; j++) {
                if(i==0){
                    dp[i][j]=false;
                }
                if(j==0){
                    dp[i][j]=true;
                }
            }
            
        }


        //* fill dp */ */

        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < range+1; j++) {

                if(arr[i-1]<=j){
                    dp[i][j]=dp[i-1][j-arr[i-1]]||dp[i-1][j];
                }
                else if(arr[i-1]>j){
                    dp[i][j]=dp[i-1][j];
                }
            }
        }


        ArrayList<Integer> ans=new ArrayList<>();
        for (int i = n; i <n+1; i++) {
            for (int j = 0; j <range/2; j++) {
                if(dp[i][j]==true){
                    ans.add(j);
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(minimunDiffernce(new int[]{1,6,11,5},4));
    }
}
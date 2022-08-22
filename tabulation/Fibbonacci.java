import java.util.Arrays;

public class Fibbonacci{

    public static long fib(int n){
        long[] dp=new long[n+1];

    Arrays.fill(dp,0);
    dp[1]=1;

    for (int i = 2; i <dp.length; i++) {
      dp[i]=dp[i-1]+dp[i-2];
    }

    return dp[n];
    }
    

    public static void main(String[] args) {
        System.out.println(fib(83));
    }
}
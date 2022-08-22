import java.util.Arrays;

public class CanSumTabulation {
    
    public static boolean canSum(int target,int[] numbers){
        boolean[] dp=new boolean[target+1];

        Arrays.fill(dp, false);
        dp[0]=true;

        for (int i = 0; i <dp.length; i++) {
            if(dp[i]==true){
                for (int j = 0; j < numbers.length; j++) {
                    if(i+numbers[j] <dp.length){
                        dp[i+numbers[j]]=true;
                    }
                }
            }
        }
        return dp[target];
    }

    public static void main(String[] args) {
        int arr[]={5,4,3};
        System.out.println(canSum(2, arr));
    }
}

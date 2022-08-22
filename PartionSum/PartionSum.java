import java.util.Arrays;

public class PartionSum{

public static boolean partion(int[] numbers){

    int Sum=0;
    for (int i : numbers) {
        Sum+=i;
    }


    if(Sum%2!=0){
        return false;
    }else{
        if(subSetSum(numbers,Sum/2)==true){
            System.out.println(Sum);
            return true;
        }
    }

    return false;
}

public static boolean subSetSum(int[] numbers ,int target){
    boolean[] dp=new boolean[target+1];

    Arrays.fill(dp, false);

    dp[0]=true;

    for (int i = 0; i <dp.length; i++) {
        if(dp[i]==true){
            for (int j = 0; j <numbers.length; j++) {
                if(i+numbers[j]<dp.length){
                    dp[i+numbers[j]]=true;
                }
            }
        }
    }
    return dp[target];
}

    public static void main(String[] args) {
        System.out.println(partion(new int[]{1,5,11,8}));
    }
}
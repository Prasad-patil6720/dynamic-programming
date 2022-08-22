public class EqualSum {
    public static boolean equalSum(int[] arr,int n){
        long sum=0;
        for (int i = 0; i < n; i++) {
            sum+=arr[i];
        }

        if(sum%2!=0){
            return false;
        }else if(sum%2==0){
            return Subset.knapSack(arr, (int)sum/2);
        }

        return false;
    }
    public static void main(String[] args) {
        System.out.println(equalSum(new int[]{3,7,11,5}, 4));
    }
}

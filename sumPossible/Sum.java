public class Sum{

    public static boolean sum(int target,int[] numebers){
        boolean[][] dp=new boolean[numebers.length+1][target+1];


        //*intitialization */
        for (int i = 0; i <=numebers.length; i++) {
            for (int j = 0; j <=target; j++) {
                if(i==0){
                    dp[i][j]=false;
                }
                if(j==0){
                    dp[i][j]=true;
                }
            }
            
        }



        for (int i = 1; i <=numebers.length; i++) {
            for (int j = 1; j <=target; j++) {

                if(numebers[i-1]<=target){
                    dp[i][j]=dp[i][j-numebers[i-1]] || dp[i-1][j];
                }
                else if(numebers[i-1]>target){
                    dp[i][j]=dp[i-1][j];
                }
        }

    }
    
    return dp[numebers.length][target];
}

    public static void main(String[] args) {
        System.out.println(sum(11, new int[]{2,3,7,8,10}));
    }
}
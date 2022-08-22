public class RodCutting{

    public static int rodCuttingMaximum(int[] length,int[] price,int N){
        int[][] dp=new int[N+1][price.length+1];

        //*intitializaiotn */
        for (int i = 0; i < N+1; i++) {
            for (int j = 0; j < price.length+1; j++) {
                if(i==0||j==0){
                    dp[i][j]=0;
                }
            }
        }

        //* file table */
        for (int i = 1; i < N+1; i++) {
            for (int j = 1; j < price.length+1; j++) {
                
                if(length[i-1]<=j){
                    dp[i][j]=Math.max(price[i-1]+dp[i][j-length[i-1]], dp[i-1][j]);
                }
                else if(length[i-1]>j){
                    dp[i][j]=dp[i-1][j];
                }
                System.out.println("for i the row "+i+" dp"+"["+i+"]"+"["+j+"]"+"="+dp[i][j]);

            }
        }

        

        return dp[N][price.length];
    }

    public static void main(String[] args) {
        System.out.println(rodCuttingMaximum(new int[]{1,2,3,4,5,6,7,8},new int[]{1,5,8,9,10,17,17,20},8));
        
    }
}
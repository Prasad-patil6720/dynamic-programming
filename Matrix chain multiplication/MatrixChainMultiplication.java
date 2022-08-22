public class MatrixChainMultiplication{

    public static int min=Integer.MAX_VALUE;
    public static int ans(int tempans){
        if(tempans<min){

            min=tempans;
            return min;
        }

        return  min;
    }

    public static int ans;
    public static int Solve(int[] arr,int i,int j){

        //* base coindition */
        if(i>=j){
            return 0;
        }


        for(int k=i;k<=j-1;k++){
            int tempans=Solve(arr, i, k)+Solve(arr, k+1, j)+(arr[i-1]*arr[k]*arr[j]);

            // ans=MatrixChainMultiplication.ans(tempans);
            if(tempans<min){
                min=tempans;
            }
        }

        return min;
    }
    public static void main(String[] args) {
        int[] arr={40,20,30,10,30};

        int i=1;
        int j=4;

        System.out.println(Solve(arr,i,j));
    }
}
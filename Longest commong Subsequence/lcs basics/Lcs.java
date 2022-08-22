import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Lcs{

    public static int lcs(char[] x,char[] y,int n,int m,int[][] memo){
        //* base condition */
        if(n==0||m==0){
            return 0;
        }
        if(memo[n][m]!=-1){
            return memo[n][m];
        }

        //* conditon if match */
        if(x[n-1]==y[m-1]){
            memo[n][m]=1+lcs(x, y, n-1, m-1,memo);
            return memo[n][m];
        }else {
            //*choice diagram */
            memo[n][m]= Math.max(lcs(x, y, n, m-1,memo), lcs(x, y, n-1, m,memo));
            return memo[n][m];
        }


        
    }

    public static void main(String[] args) {
       String s="abcdefgh";
       String b="jklmno";

       char[] x=s.toCharArray();
       char[] y=b.toCharArray();
       int[][] memo=new int[s.length()+1][b.length()+1];

       for (int[] is : memo) {
        Arrays.fill(is,-1);
       }
System.out.println(lcs(x, y, s.length(), y.length, memo));
    }
}
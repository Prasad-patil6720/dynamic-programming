import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Lcs{
    static int max=0;

    public static int lcs(char[] x,char[] y,int n,int m,int count){
        //* base condition */
        if(n==0||m==0){
            return count;
        }
     

        //* conditon if match */
        if(x[n-1]==y[m-1]){
            count=1+lcs(x, y, n-1, m-1,count+1);
        
        
        }
            //*choice diagram */
          count=  Math.max(count,Math.max(lcs(x, y, n, m-1,count), lcs(x, y, n-1, m,count)));
            
        
        return count;

        
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
System.out.println(lcs(x, y, s.length(), y.length, 0));
    }
}
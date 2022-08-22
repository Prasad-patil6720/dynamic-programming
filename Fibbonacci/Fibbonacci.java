import java.util.Arrays;

public class Fibbonacci{

    static int[] memo=new int[20000];
    static{
        Arrays.fill(memo,-1);
    }
    public static int fib(int n){

        if(memo[n]!=-1){
            return memo[n];
        }
        
        //*base case */
        if(n<=1){
            return n;
        }

        //*choice */
    // memo[n]=
        return memo[n]=fib(n-1)+fib(n-2);
    }

    public static void main(String[] args) {
        System.out.println(fib(7));
        // System.out.println(fib(200));
        // System.out.println(fib(300));
        // System.out.println(fib(400));
        // System.out.println(fib(500));
    }
}
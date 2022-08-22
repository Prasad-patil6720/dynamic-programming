public class EvaluateExpression{
    public static int ans=0;
    int solve(char[] s,int i,int j,boolean isTrue){

        //*base condition */
        if(i>j){
            return false;
        }
        if(i==j){
            if(isTrue==true){
                return s[i]=true;
            }else{
                return s[i]=false;
            }
        }
        for(int k=i+1; k<j;k=k+2){
            int leftTrue=solve(s, i, k-1, true);
            int leftFalse=solve(s, i, k-1, false);
            int rightTrue=solve(s, k+1, j, true);
            int rigthFalse=solve(s, k+1, j, false);

            if(s[k]=='&'){
                if(isTrue==true){
                    ans=ans+(leftTrue+rightTrue);
                }else{
                    ans=ans+(leftTrue*rigthFalse)+(leftFalse*rightTrue)+(leftFalse*rigthFalse);
                }
            }
            else if(s[k]=='|'){
                if(isTrue==true){
                    ans=ans+(leftTrue*rigthFalse)+(leftFalse*rightTrue)+(leftTrue*rightTrue);
                }else{
                    ans=ans+(leftFalse*rigthFalse);
                }
            }
            else if(s[k]=='^'){
                if(isTrue==true){
                    ans=ans+(leftTrue*rigthFalse)+(leftFalse*rightTrue);
                }else{
                    ans=ans+(leftTrue*rightTrue)+(leftFalse*rigthFalse);
                }
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        
    }
}
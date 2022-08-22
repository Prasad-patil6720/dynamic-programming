public class PalindromePartioning{


    public static boolean isPalindrome(String s,int i,int j){
      
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    
    //* solve with the help of matrix chain multiplication */
    public static int minNoOfPartioning(String s,int i,int j){
       

        if(i>=j){
            return 0;
        }

        if(isPalindrome(s,i,j)==true){
            return 0;
        }
        int ans=Integer.MAX_VALUE;
        for(int k=i; k<j;k++){
            int tempasn=1+minNoOfPartioning(s, i, k)+minNoOfPartioning(s, k+1, j);
           
            if(tempasn<ans){
                ans=tempasn;

            }
        
        }

        return ans;

    }
    public static void main(String[] args) {
        
        String str="nitik";
        // char[] s=str.toCharArray();

        System.out.println(minNoOfPartioning(str, 0, str.length()-1));

    }
}
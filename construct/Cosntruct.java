public class Cosntruct{

    public static String[] ans=new String[10000];
public static boolean canConstruct(String target,String[] arr){

    if(ans[tar])
    if(target.length()==0) return true;


    for (String str : arr) {
        if(target.indexOf(str)==0){
           
            String suffix=target.substring(str.length(), target.length());
            
            if(canConstruct(suffix, arr)==true){
                return true;
            }
        }
    }
    return false;
}




    public static void main(String[] args) {
        String[] arr={"ab","abc","cd","def","abcd"};
        System.out.println(canConstruct("abcdef", arr));
    }
}
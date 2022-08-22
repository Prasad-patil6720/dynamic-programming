public class Cansum{

    public static boolean canSum(int target,int[] arr){

        if(target==0) return true;
        if(target<0) return false;

        for (int i:arr) {
            
            int reminder=target-i;
            System.out.println("the value of i "+i +"and remainder "+reminder+" target "+target);
            if(canSum(reminder,arr)==true){
                return true;
            }
        }

        return false;


    }

    public static void main(String[] args) {


        boolean ans=canSum(7,new int[]{5,4,3,1});
        System.out.println(ans);
      
    }
}
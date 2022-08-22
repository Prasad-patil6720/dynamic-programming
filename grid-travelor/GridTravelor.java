import java.util.HashMap;
import java.util.Map;

public class GridTravelor{


    public static int gridTravelor(int m,int n){

    



        if(m==1&&n==1) return 1;
        if(m==0|| n==0) return 0;

        return gridTravelor(m-1, n) +gridTravelor(m, n-1);
    }

    public static void main(String[] args) {
        System.out.println(gridTravelor(18, 18));
    }
}
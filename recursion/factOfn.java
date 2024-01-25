import java.util.ArrayList;
import java.util.List;

public class factOfn {
    public static void main(String[] args) {
        System.out.println(factorialNumbers(7));

    }

    public static Long factorial(long n){
        if(n == 1){
            return n;
        }
        return n*factorial(n-1);


    }

    public static List<Long> factorialNumbers(long n){
        ArrayList<Long> factNum = new ArrayList<Long>();
        for ( long i= 1 ; i<n; i++){
            Long ans = factorial(i);
            if(ans<= n){
                factNum.add(ans);
            }
            else {
                break;
            }
        }
        return factNum;

    }
}

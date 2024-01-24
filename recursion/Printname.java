import java.util.ArrayList;
import java.util.List;
public class Printname {
    public static void main(String[] args) {
        printNtimes(5);

    }

    public  static List<String> printNtimes(int n){
        List<String> l = new ArrayList<>();
        return print(l,n);
    }
    public static List<String>  print(List<String> l,int n){
        if(n>0){
            l.add("Dhanush");
            print(l,n-1);
        }
        return l;
    }


}

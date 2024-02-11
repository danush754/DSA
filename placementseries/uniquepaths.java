public class uniquepaths {
    public static void main(String[] args) {
        int m = 3;
        int n = 7;
        System.out.println(uniquePaths(m,n));

    }

    public static int uniquePaths(int m, int n){
        int N = n + m -2;
        int r = m-1;
        long count = 1;

        for (int i=1; i<=r; i++){
            count = count * (N-r+i)/i;
        }

        return (int)count ;
    }


}

public class SumofN {
    public static void main(String[] args) {
        System.out.println(sumFirstN(3));
    }

    public static long sumFirstN(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumFirstN(n - 1);

    }
}

    

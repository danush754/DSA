public class Prntnums {
    public static void main(String[] args) {
        printNos(5);
    }
    public  static int[] printNos(int x){
        int[] result = new int[x];
        int index = 0;
        result[index] = x;
        index += 1;
        printNos(x-1);

        return result;
    }
}

public class recursion1 {
    public static void main(String[] args) {
        printName(3);
    }

    static void printName(int n){
        if (n==1){
            System.out.println("Dhanush");
            return ;
        }
        System.out.print("Dhanush");
        printName(n-1);

    }
}

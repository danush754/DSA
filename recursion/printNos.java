public class printNos {

    public static void main(String[] args) {
        printnos(5);

    }

    public static int[] printarray(int[] arr,int x,int index){
        if(x>0){
            arr[index] = x;
            printarray(arr,x-1,index+1);
        }
        return  arr;

    }

    public  static  int[] printnos(int x){
        int [] arr = new int[x];
        int index = 0;
        return printarray(arr,x,index);
    }
}

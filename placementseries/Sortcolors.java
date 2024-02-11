import java.util.ArrayList;
import java.util.Arrays;

public class Sortcolors {
    public static void main(String[] args) {
        int[] colors = {2,0,2,1,1,0};
        int n = colors.length;
        System.out.println(Arrays.toString(sortColor(colors,n)));
    }

    private static int[] sortColor(int[] colors, int n) {
        int start = 0;
        int end = n-1;
        return mergeSort(start,end,colors,n);
    }

    private static int[] mergeSort(int start, int end, int[] colors, int n) {
        if(start >= end){
            return colors;
        }
        int mid = (start + end) / 2 ;
        mergeSort(start,mid,colors,n);
        mergeSort(mid+1,end,colors,n);
        merge(start,end,mid,colors,n);
        return colors;
    }

    private static  int[] merge(int start,int end,int mid,int[] colors,int n){
        ArrayList<Integer> arr = new ArrayList<>();
        int left = start;
        int right = mid+1;

        while(left <= mid && right <= end ){
            if(colors[left] <= colors[right]){
                arr.add(colors[left]);
                left++;
            }
            else{
                arr.add(colors[right]);
                right++;
            }
        }

        while(left <= mid){
            arr.add(colors[left]);
            left++;
        }

        while(right <= end){
            arr.add(colors[right]);
            right++;
        }

        for (int i =start;i<=end;i++){
            colors[i] = arr.get(i-start);
        }

        return colors;
    }


}

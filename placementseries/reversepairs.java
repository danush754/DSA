import java.util.ArrayList;
import java.util.Arrays;

public class reversepairs {
    public static void main(String[] args) {
        int n = 5;
        int[] nums = {1,3,2,3,1};
        System.out.println(mergeSort(nums,0,n-1));

    }

    private static int mergeSort(int[] nums,int start,int end) {
        int count =  0;
        if (start >= end) {
            return count ;
        }
        int mid = (start + end) / 2;
        count += mergeSort(nums, start, mid);
        count += mergeSort(nums, mid + 1, end);
        count +=  merge(nums, start, mid, end);

        return count;
    }

    private static int merge(int[] nums, int start, int mid, int end) {
        int count = 0;
        int j = mid +1;
        for (int i = start;i<=mid;i++){
            while(j<=end && nums[i]>(2 * (long) nums[j]) ){
                j++;
            }
            count += (j - (mid + 1));
        }


        ArrayList<Integer> sortedArr = new ArrayList<>();
        int left = start;
        int right = mid +1;

        while(left <= mid && right <= end ){
            if (nums[left] <= nums[right]) {
                sortedArr.add(nums[left]);
                left++;
            } else {
                sortedArr.add(nums[right]);
                right++;
            }
        }

        while(left <= mid){
            sortedArr.add(nums[left]);
            left++;
        }

        while (right <= end){
            sortedArr.add(nums[right]);
            right++;
        }

        for (int i = start; i <= end;i++){
            nums[i] = sortedArr.get(i-start);
        }
        return  count;

    }

}

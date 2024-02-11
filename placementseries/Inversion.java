import java.util.ArrayList;

public class Inversion {
    public static void main(String[] args) {
        int[] nums = {5,4,3,2,1};
        int n = 5;
        int count  = numberOfInversions(nums,n);
        System.out.println("The number of counts = " + count);

    }

    public static int numberOfInversions(int[] nums, int n) {

        return mergesort(nums,0,n-1);
    }

    public static int mergesort(int[] nums, int low, int high) {
        int count = 0;
        if (low >= high ) return count;
        int mid = (low + high )/2;
        count += mergesort(nums,low,mid);
        count += mergesort(nums,mid+1,high);
        count += merge(nums,low,mid,high);
        return count;
    }

    private static int merge(int[] nums, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        int count = 0;

        while(left <= mid && right <= high){
            if(nums[left] <= nums[right]){
                temp.add(nums[left]);
                left++;
            }
            else {
                temp.add(nums[right]);
                count += (mid - left +1);
                right++;
            }
        }

        while(left <= mid){
            temp.add(nums[left]);
            left++;
        }

        while(right <= high){
            temp.add(nums[right]);
            right++;
        }

        for (int i = low; i <= high; i++) {
            nums[i] = temp.get(i - low);
        }

        return count;
    }


}

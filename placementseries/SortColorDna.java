import java.util.Arrays;

public class SortColorDna {
    public static void main(String[] args) {
        int[] nums = {2,0,1};
        sortColors(nums);
    }

    private static void sortColors(int[] nums) {
        int temp;
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while(mid <= high){
            switch (nums[mid]){
                case 0:
                    temp = nums[low];
                    nums[low] = nums[mid];
                    nums[mid] = temp;
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    temp = nums[mid];
                    nums[mid] = nums[high];
                    nums[high] = temp;
                    high--;
                    break;
            }
        }
        System.out.println(Arrays.toString(nums));

    }
}

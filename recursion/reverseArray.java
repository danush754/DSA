import java.util.Arrays;

public class reverseArray {

    public static void main(String[] args) {
        int [] nums = {5, 7, 8, 1, 6, 3};
        System.out.println(Arrays.toString(revArr(6,nums)) );

    }

    public static int[] revArr(int n,int[] nums){
        printArr(nums,0,n-1);
        return nums;
    }

    public static void printArr(int[] nums,int startVal,int endVal){
        if(startVal <endVal){
            int temp = nums[startVal];
            nums[startVal] = nums[endVal];
            nums[endVal] = temp;
            printArr(nums, startVal+1, endVal-1);
        }
    }
}

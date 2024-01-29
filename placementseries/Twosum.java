import java.util.Arrays;

public class Twosum {
    public static void main(String[] args) {
        int[] arr= {2,7,11,15};
        System.out.println(Arrays.toString(twosum(arr,9)) );

    }

    public static int[] twosum(int[] nums, int target){
        int[] arr = new int[2];
        boolean found = false;
        for(int i =0;i<nums.length;i++){
            for (int j = 0;j< nums.length;j++){
                if(nums[i]+nums[j] == target){
                    arr[0]= i;
                    arr[1] = j;
                    found = true;
                    break;
                }
            }
            if(found == true){
                break;
            }
        }
        return  arr;
    }
}

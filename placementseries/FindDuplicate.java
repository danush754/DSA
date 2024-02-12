public class FindDuplicate {
    public static void main(String[] args) {
        int[] nums ={1,4,3,2,1};
        System.out.println(findDuplicate(nums));
    }

    private static int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while (slow != fast);

         fast = nums[0];

        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }
}

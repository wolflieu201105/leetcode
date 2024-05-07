import java.util.Arrays;

class Solution {
    public void nextPermutation(int[] nums) {
        if (nums.length <= 1) {
            return;
        }
        int length = nums.length;
        int start = length - 1;
        while (start > 0){
            if (nums[start-1] < nums[start]){
                break;
            }
            start--;
        }
        if (start == 0){
            for (int i = (length-1) / 2; i >= 0; i--){
                int swap = nums[i];
                nums[i] = nums[length-i-1];
                nums[length-i-1] = swap;
            }
            return;
        }
        Arrays.sort(nums, start, length);
        int i = start;
        start--;
        while (nums[i] <= nums[start]){
            i++;
        }
        int swap = nums[i];
        nums[i] = nums[start];
        nums[start] = swap;
    }
}

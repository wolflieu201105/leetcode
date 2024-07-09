class Solution {
    public void moveZeroes(int[] nums) {
        int numZeros = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0){
                numZeros ++;
            }
            else if (numZeros != 0){
                nums[i - numZeros] = nums[i];
                nums[i] = 0;
            }
        }
    }
}
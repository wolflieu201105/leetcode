class Solution {
    public boolean canJump(int[] nums) {
        int furthest = nums.length - 1;
        int prevJump = furthest;
        for (int i = furthest - 1; i >= 0; i--){
            if (nums[i] >= furthest - i){
                furthest = i;
            }
        }
        return (furthest == 0);
    }
}
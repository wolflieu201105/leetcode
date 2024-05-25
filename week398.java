class Solution {
    public boolean isArraySpecial(int[] nums) {
        boolean even = (nums[0] % 2 == 0);
        for (int i = 1; i < nums.length; i++) {
            if (!(even ^ (nums[i]%2 == 0))) {
                return false;
            }
            even = !even;
        }
        return true;
    }
}
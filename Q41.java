class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int first = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                first = i;
                break;
            }
        }
        if (first == -1) {
            return 1;
        }
        int count = 1;
        int last = -1;
        while (first < nums.length) {
            if (nums[first] == last){
                first++;
                continue;
            }
            if (nums[first] != count) {
                return count;
            }
            first++;
            last = count;
            count++;
        }
        return count;
    }
}
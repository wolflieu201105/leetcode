class Solution {
    public int jump(int[] nums) {
        int furthest = nums.length - 1;
        int count = 0;
        while (furthest != 0){
            for (int i = 0; i < furthest; i++){
                if (nums[i] >= furthest - i){
                    furthest = i;
                    count ++;
                    break;
                }
            }
        }
        return count;
    }
}
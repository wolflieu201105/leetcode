class Solution {
    public int majorityElement(int[] nums) {
        int[] numCol = new int[50000];
        int[] numTime = new int[50000];
        for (int i = 0; i < nums.length; i++) {
            int y = 0;
            while (numCol[y] != 0) {
                if (numCol[y] == nums[i]) {
                    numTime[y]++;
                    break;
                }
                y++;
            }
            numCol[y] = nums[i];
            numTime[y]++;
        }
        int max = 0;
        int val = numTime[0];
        int i = 1;
        while (numTime[i] != 0){
            if (numTime[i] > val) {
                max = i;
                val = numTime[i];
            }
            i++;
        }
        return numCol[max];
    }
}
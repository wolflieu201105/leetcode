class Solution {
    public int findWinningPlayer(int[] skills, int k) {
        if (k == 1){
            if (skills[1] > skills[0]){
                return 1;
            }
            return 0;
        }
        int count = 0;
        int max = 0;
        for (int i = 1; i < skills.length; i++) {
            if (skills[max] > skills[i]) {
                count++;
                if (count == k){
                    return max;
                }
            }
            else {
                max = i;
                count = 1;
            }
        }
        return max;
    }
}
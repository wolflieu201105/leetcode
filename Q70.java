class Solution {
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        int firstChance = 1;
        int secondChance = 1;
        for (int i = 1; i < n; i++){
            int nextChance = firstChance + secondChance;
            firstChance = secondChance;
            secondChance = nextChance;
        }
        return secondChance;
    }
}
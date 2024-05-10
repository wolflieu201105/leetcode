class Solution {
    public int singleNumber(int[] nums) {
        int[] check = new int[60002];
        for (int num: nums) {
            check[num + 30000]++;
        }
        for (int i = 1; i <= 60002; i++){
            if (check[i] == 1) {
                return i - 30000;
            }
        }
        return 0;
    }
}
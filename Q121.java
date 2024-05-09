class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        if (prices.length < 2){
            return max;
        }
        int currentMin = prices[0];
        int curr = 1;
        while (curr < prices.length) {
            if (prices[curr] - currentMin > max) {
                max = prices[curr] - currentMin;
            }
            if (currentMin > prices[curr]) {
                currentMin = prices[curr];
            }
            curr++;
        }
        return max;
    }
}
class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if (timeSeries.length == 1) {
            return duration;
        }
        int time = duration;
        for (int i = 1; i < timeSeries.length; i++) {
            int gap = timeSeries[i] - timeSeries[i-1];
            if (gap > duration) time += duration;
            else time += gap;
        }
        return time;
    }
}
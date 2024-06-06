class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total = 0;
        int start = 0;
        int check = 0;
        for (int i = 0; i < gas.length; i++) {
            if (check < 0) {
                check = 0;
                start = i;
            } 
            cost[i] = gas[i] - cost[i];
            total += cost[i];
            check += cost[i];
        }
        if (total < 0){
            return -1;
        }
        return start;
    }
}
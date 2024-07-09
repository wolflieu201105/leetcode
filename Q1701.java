class Solution {
    public double averageWaitingTime(int[][] customers) {
        double totalWaitTime = 0;
        int lastWaitTime = 0;
        for (int[] customer: customers){
            if (customer[0] < lastWaitTime){
                totalWaitTime += lastWaitTime - customer[0];
                customer[0] = lastWaitTime;
            }
            totalWaitTime += customer[1];
            lastWaitTime = customer[0] + customer[1];
        }
        return totalWaitTime/customers.length;
    }
}
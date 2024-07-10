class Solution {
    public int minOperations(String[] logs) {
        int value = 0;
        for (String s : logs) {
            int change = 1;
            for (int i = s.length() - 2; i >= 0; i--){
                if (s.charAt(i) != '.'){
                    break;
                }
                change--;
            }
            value += change;
            if (value < 0){
                value = 0;
            }
        }
        return value;
    }
}
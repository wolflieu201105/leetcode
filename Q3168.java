class Solution {
    public int minimumChairs(String s) {
        int max = 0;
        int current = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'E') {
                current++;
                if(current > max) {
                    max++;
                }
            }
            else {
                current --;
            }
        }
        return max;
    }
}
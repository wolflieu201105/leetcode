class Solution {
    public int titleToNumber(String columnTitle) {
        int value = 0;
        for (int i = 0; i < columnTitle.length(); i++){
            value = value * 26;
            value += (int) columnTitle.charAt(i) - 64;
        }
        return value;
    }
}
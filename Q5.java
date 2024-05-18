class Solution {
    public String longestPalindrome(String s) {
        int longestLength = 0;
        int palinStart = 0;
        int i = 0;
        while (i < s.length() - longestLength) {
            int length = s.length()-1-i;
            while (length > 0 && !isPalindrome(s, i, i+length)) {
                length--;
            }
            if (length > longestLength) {
                longestLength = length;
                palinStart = i;
            }
            i++;
        }
        return s.substring(palinStart, palinStart + longestLength + 1);
    }
    public boolean isPalindrome(String s, int start, int end) {
        int mid = (start + end + 1)/2;
        for (int i = start; i < mid; i++) {
            if (s.charAt(i) != s.charAt(end + start - i)){
                return false;
            }
        }
        return true;
    }
}
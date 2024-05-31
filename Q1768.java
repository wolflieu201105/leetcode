class Solution {
    public String mergeAlternately(String word1, String word2) {
        String returnString = "";
        int length1 = word1.length();
        int length2 = word2.length();
        for (int i = 0; i < length1 && i < length2; i++) {
            returnString = returnString + word1.charAt(i) + word2.charAt(i);
        }
        if (length1 < length2) {
            for (int i = length1; i < length2; i++) {
                returnString = returnString + word2.charAt(i);
            }
        }
        else {
            for (int i = length2; i < length1; i++) {
                returnString = returnString + word1.charAt(i);
            }
        }
        return returnString;
    }
}
class Solution {
    public int countSegments(String s) {
        int num = 0;
        boolean isWord = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                if (isWord) {
                    num++;
                    isWord = false;
                }
                continue;
            }
            if (!isWord) {
                isWord = true;
            }
        }
        if (s.length() > 0 && s.charAt(s.length() - 1) != ' ') {
            return num + 1;
        }
        return num;
    }
}
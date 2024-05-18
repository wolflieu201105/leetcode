class Solution {
    public int myAtoi(String s) {
        while(s.length() > 0 && s.charAt(0) == ' '){
            s = s.substring(1);
        }
        if (s.length() == 0) {
            return 0;
        }
        boolean negative = false;
        if(s.charAt(0) == '+' || s.charAt(0) == '-'){
            if (s.charAt(0) == '-') {
                negative = true;
            }
            s = s.substring(1);
        }
        long atoi = 0;
        for (int i = 0; i < s.length(); i++) {
            int curr = atoiChar(s.charAt(i));
            if(curr == -1) {
                break;
            }
            atoi = atoi * 10;
            atoi += curr;
            if (negative) {
                if (-atoi < Integer.MIN_VALUE) {
                    return Integer.MIN_VALUE;
                }
            }
            else {
                if (atoi > Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                }
            }
        }
        if (negative) {
            return (int) -atoi;
        }
        return (int) atoi;
    }
    public int atoiChar(char c) {
        if (c == '0') {
            return 0;
        }
        if (c == '1') {
            return 1;
        }
        if (c == '2') {
            return 2;
        }
        if (c == '3') {
            return 3;
        }
        if (c == '4') {
            return 4;
        }
        if (c == '5') {
            return 5;
        }
        if (c == '6') {
            return 6;
        }
        if (c == '7') {
            return 7;
        }
        if (c == '8') {
            return 8;
        }
        if (c == '9') {
            return 9;
        }
        return -1;
    }
}
class Solution {
    public int numDecodings(String s) {
        if (s.length() == 1) {
            if (s.charAt(0) == '0'){
                return 0;
            }
            return 1;
        }
        int length = s.length() - 1;
        int secondPointer = 1;
        int firstPointer = 1;
        if (s.charAt(length) - '0' == 0){
            secondPointer = 0;
            if (s.charAt(length - 1) - '0' == 0 || s.charAt(length - 1) - '0' > 2){
                firstPointer = 0;
            }
            else {
                firstPointer = 1;
            }
        }
        else {
            if (s.charAt(length - 1) - '0' == 0){
                firstPointer = 0;
            }
            else if (s.charAt(length - 1) - '0' == 1 || (s.charAt(length - 1) - '0' == 2 && s.charAt(length) - '0' < 7)){
                firstPointer = 2;
            }
        }
        length -= 2;
        while (length >= 0){
            int num = s.charAt(length) - '0';
            if (num == 0){
                secondPointer = firstPointer;
                firstPointer = 0;
            }
            else if (num == 1 || (num == 2 && s.charAt(length + 1) - '0' < 7)){
                int chance = secondPointer + firstPointer;
                secondPointer = firstPointer;
                firstPointer = chance;
            }
            else {
                secondPointer = firstPointer;
            }
            length--;
        }
        return firstPointer;
    }
}
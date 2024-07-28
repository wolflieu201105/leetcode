class Solution {
    public int nonSpecialCount(int l, int r) {
        int start = (int)Math.ceil(Math.sqrt(l));
        int end = (int)Math.floor(Math.sqrt(r));
        int count = 0;
        for (int i = start; i <= end; i++){
            if (i < 2) {
                continue;
            }
            boolean check = true;
            for (int y = 2; y <= Math.sqrt(i); y++) {
                if (i % y == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                count++;
            }
        }
        return r - l - count + 1;
    }
}
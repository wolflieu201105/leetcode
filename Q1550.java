class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        boolean check1 = false;
        boolean check2 = false;
        for (int num : arr){
            if (num % 2 == 1){
                if (check1){
                    if (check2){
                        return true;
                    }
                    check2 = true;
                }
                check1 = true;
            }
            else{
                check1 = false;
                check2 = false;
            }
        }
        return false;
    }
}
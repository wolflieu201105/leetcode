class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int max = 0;
        boolean containsOne = false;
        int lowerBound = 0; 
        int upperBound = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 1) {
                max += (i/2);
                lowerBound = i;
                containsOne = true;
                break;
            }
        }
        if (!containsOne) {
            return(((flowerbed.length + 1)/2) >= n);
        }
        for (int i = flowerbed.length - 1; i >= 0; i--) {
            if (flowerbed[i] == 1) {
                max += (flowerbed.length - i - 1)/2;
                upperBound = i;
                break;
            }
        }
        int zeroLength = 0;
        for (int i = lowerBound + 1; i < upperBound; i++){
            if (flowerbed[i] == 0) {
                zeroLength ++;
            }
            else {
                max += (zeroLength-1)/2;
                zeroLength = 0;
            }
        }
        max += (zeroLength-1)/2;
        return(max >= n);
    }
}
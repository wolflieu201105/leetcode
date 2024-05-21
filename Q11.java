class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int length = height.length - 1;
        int max = (Math.min(height[start], height[end]))*length;
        while (start != end) {
            if (height[start] > height[end]) {
                end --;
            }
            else {
                start ++;
            }
            length--;
            int thisWater = (Math.min(height[start], height[end]))*length;
            if (thisWater > max) {
                max = thisWater;
            }
        }
        return max;
    }
}
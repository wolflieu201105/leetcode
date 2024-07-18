class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] justAnArray = new int[nums1.length];
        for (int y = 0; y < nums1.length; y++){
            int start = 0;
            for (int i = 0; i < nums2.length; i++){
                if (nums2[i] == nums1[y]){
                    start = i + 1;
                    break;
                }
            }
            boolean check = true;
            for (int i = start; i < nums2.length; i++){
                if (nums2[i] > nums1[y]){
                    justAnArray[y] = nums2[i];
                    check = false;
                    break;
                }
            }
            if (check){
                justAnArray[y] = -1;
            }
        }
        return justAnArray;
    }
}
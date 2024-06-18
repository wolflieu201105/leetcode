class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> mySet = new HashSet<Integer>();
        for (int i : nums) {
            mySet.add(i);
        }
        int longest = 0;
        for (int i : nums) {
            if (!mySet.contains(i - 1)){
                int length =  1;
                while (mySet.contains(i + length)) {
                    length++;
                }
                longest = Math.max(longest, length);
            }
        }
        return longest;
    }
}
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        return sub(nums);
    }

    public List<List<Integer>> sub(int[] nums) {
        List<List<Integer>> returnList = new ArrayList<List<Integer>>();
        if (nums.length == 0) {
            returnList.add(new ArrayList<Integer>());
            return returnList;
        }
        int replica = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                replica = i;
                break;
            }
        }
        if (nums[0] == nums[nums.length - 1]) {
            replica = nums.length;
        }
        List<List<Integer>> nextList = sub(Arrays.copyOfRange(nums, replica, nums.length));
        for (int i = 0; i < nextList.size(); i++) {
            List<Integer> currList = nextList.get(i);
            returnList.add(new ArrayList<Integer>(currList));
            for (int y = 0; y < replica; y++) {
                currList.add(nums[0]);
                returnList.add(new ArrayList<Integer>(currList));
            }
        }
        return returnList;
    }
}
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> returnList = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        return recurPermute(new ArrayList<Integer>(), nums);
    }
    private List<List<Integer>> recurPermute (List<Integer> currentList, int[] nums) {
        List<List<Integer>> returnList = new ArrayList<List<Integer>>();
        if (nums.length == 0) {
            returnList.add(currentList);
            return returnList;
        }
        int lastNum = 11;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == lastNum){
                continue;
            }
            lastNum = nums[i];
            List<Integer> clonedList = new ArrayList<Integer>(currentList);
            clonedList.add(lastNum);
            int[] clonedNums = new int[nums.length - 1];
            for (int y = 0; y < i; y++) {
                clonedNums[y] = nums[y];
            } 
            for (int y = i + 1; y < nums.length; y++) {
                clonedNums[y-1] = nums[y];
            } 
            for (List<Integer> list: recurPermute (clonedList, clonedNums)){
                returnList.add(list);
            }
        }
        return returnList;
    }
}
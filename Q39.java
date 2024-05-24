class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        return substituteSum(new ArrayList<Integer>(), candidates, target);
    }
    private List<List<Integer>> substituteSum(List<Integer> beforeList, int[] candidates, int target) {
        List<List<Integer>> returnList = new ArrayList<List<Integer>>();
        if (target == 0) {
            returnList.add(beforeList);
            return returnList;
        }
        if (target < 0) {
            return returnList;
        }
        for (int i = 0; i < candidates.length; i++) {
            List<Integer> clonedList = new ArrayList<Integer>(beforeList);
            clonedList.add(candidates[i]);
            for (List<Integer> nextList : substituteSum(clonedList, Arrays.copyOfRange(candidates, i, candidates.length), target - candidates[i])) {
                returnList.add(nextList);
            }
        }
        return returnList;
    }
}
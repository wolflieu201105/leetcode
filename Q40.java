class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
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
        int last = 0;
        for (int i = 0; i < candidates.length; i++) {
            if (candidates[i] == last) {
                continue;
            }
            last = candidates[i];
            List<Integer> clonedList = new ArrayList<Integer>(beforeList);
            clonedList.add(candidates[i]);
            for (List<Integer> nextList : substituteSum(clonedList, Arrays.copyOfRange(candidates, i + 1, candidates.length), target - candidates[i])) {
                returnList.add(nextList);
            }
        }
        return returnList;
    }
}
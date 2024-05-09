class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> returnList = new ArrayList<List<Integer>>();
        if (numRows == 0) {
            return returnList;
        }
        List<Integer> priorList = new ArrayList<Integer>();
        priorList.add(1);
        returnList.add(priorList);
        for (int i = 1; i < numRows; i++) {
            List<Integer> nextList = new ArrayList<Integer>();
            nextList.add(1);
            for (int y = 1; y < i; y++){
                nextList.add(priorList.get(y-1) + priorList.get(y));
            }
            nextList.add(1);
            priorList = nextList;
            returnList.add(priorList);
        }
        return returnList;
    }
}
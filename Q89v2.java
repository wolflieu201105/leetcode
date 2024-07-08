class Solution {
    public List<Integer> grayCode(int n) {
        if (n == 1) {
            List<Integer> returnList = new ArrayList<Integer>();
            returnList.add(0);
            returnList.add(1);
            return returnList;
        }
        int thisNum = (int) Math.pow(2, n - 1);
        List<Integer> returnList = grayCode(n - 1);
        for (int i = returnList.size() - 1; i >= 0; i--) {
            returnList.add(thisNum + returnList.get(i));
        }
        return returnList;
    }
}
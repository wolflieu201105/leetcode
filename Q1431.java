class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> returnList = new ArrayList<Boolean>();
        int max = 0;
        for (int i : candies) {
            if (i > max) {
                max = i;
            }
        }
        max -= extraCandies;
        for (int i = 0; i < candies.length; i++){
            returnList.add(candies[i] >= max);
        }
        return returnList;
    }
}
class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> returnList = new ArrayList<Integer>();
        int[] check = new int[n];
        for (int i = 0; i < n; i++) {
            check[i] = (int)Math.pow(2,i);
        }
        List<Integer> checkList = new ArrayList<Integer>();
        for (int i = n - 1; i >= 0; i --){
            for (int y = checkList.size(); y >= 0; y--){
                checkList.add(y, i);
            }
        }
        int curr = 0;
        for (int i = 0; i < checkList.size(); i++){
            returnList.add(curr);
            int num = checkList.get(i);
            curr += check[num];
            check[num] = -check[num];
        }
        returnList.add(curr);
        return returnList;
    }
}
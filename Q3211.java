class Solution {
    public List<String> validStrings(int n) {
        List<String> returnList = new ArrayList<String>();
        if (n == 0) {
            return returnList;
        }
        returnList.add("1");
        returnList.add("0");
        List<String> newReturnList = new ArrayList<String>();
        for (int i = 0; i < n - 1; i++) {
            for (int y = 0; y < returnList.size(); y++){
                String str = returnList.get(y);
                newReturnList.add(str + "1");
                if (str.charAt(i) == '1'){
                    newReturnList.add(str + "0");
                }
            }
            returnList = new ArrayList<String>(newReturnList);
            newReturnList = new  ArrayList<String>();
        }
        return returnList;
    }
}
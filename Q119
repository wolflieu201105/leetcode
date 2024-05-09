class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> returnList = new ArrayList<Integer>();
        if (rowIndex == 0){
            returnList.add(1);
            return returnList;
        }
        rowIndex++;
        int max = (rowIndex+1)/2;
        for (int i = 0; i < max; i++){
            long add = 1;
            for (int y = 1; y <= i; y ++) {
                add = add * (rowIndex-y);
                add = add / y;
            }
            returnList.add((int)add);
        }
        rowIndex--;
        for (int i = (rowIndex-1)/2; i >= 0; i--){
            returnList.add(rowIndex-i, returnList.get(i));
        }
        return returnList;
    }
}
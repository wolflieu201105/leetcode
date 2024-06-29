class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> newSet = new HashSet<Integer>();
        while (!newSet.contains(n)){
            newSet.add(n);
            n = change(n);
            if (n == 1){
                return true;
            }
        }
        return false;
    }
    public int change(int n){
        int newInt = 0;
        int residue;
        while (n != 0){
            residue = n%10;
            n = n/10;
            newInt += residue * residue;
        }
        return newInt;
    }
}
class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Integer> sString = new HashMap<Character,Integer>();
        HashMap<Character, Integer> tString = new HashMap<Character,Integer>();
        int index = 0;
        for (int i = 0; i < s.length(); i++){
            if (!sString.containsKey(s.charAt(i))){
                if (!tString.containsKey(t.charAt(i))){
                    sString.put(s.charAt(i), index);
                    tString.put(t.charAt(i), index);
                    index++;
                    continue;
                }
                return false;
            }
            if (!tString.containsKey(t.charAt(i))) return false;
            if (sString.get(s.charAt(i)) != tString.get(t.charAt(i))) return false;
        }
        return true;
    }
}
class Solution {
    public String reverseVowels(String s) {
        List<Character> charList = new ArrayList<Character>();
        List<Integer> intList = new ArrayList<Integer>();
        for (int i = 0; i < s.length(); i++) {
            switch(s.charAt(i)){
                case 'a':
                    charList.add('a');
                    break;
                case 'e':
                    charList.add('e');
                    break;
                case 'i':
                    charList.add('i');
                    break;
                case 'o':
                    charList.add('o');
                    break;
                case 'u':
                    charList.add('u');
                    break;
                case 'A':
                    charList.add('A');
                    break;
                case 'E':
                    charList.add('E');
                    break;
                case 'I':
                    charList.add('I');
                    break;
                case 'O':
                    charList.add('O');
                    break;
                case 'U':
                    charList.add('U');
                    break;
                default:
                    continue;
            }
            intList.add(i);
        }
        if (intList.size() == 0){
            return s;
        }
        String returnString = s.substring(0, intList.get(0)) + charList.get(charList.size() - 1);
        for (int i = 0; i < intList.size() - 1; i++) {
            returnString = returnString + s.substring(intList.get(i) + 1, intList.get(i + 1)) + charList.get(charList.size() - 2 - i);
        }
        return returnString + s.substring(intList.get(intList.size() - 1) + 1, s.length());
    }
}
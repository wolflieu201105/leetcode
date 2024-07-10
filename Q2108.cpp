class Solution {
public:
    string firstPalindrome(vector<string>& words) {
        for (string word: words){
            bool check = true;
            for (int i = 0; i < word.size() / 2; i++) {
                if (word[i] != word[word.size() - i - 1]){
                    check = false;
                    break;
                }
            }
            if (check) {
                return word;
            }
        }
        return "";
    }
};
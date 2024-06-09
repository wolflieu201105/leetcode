class Solution {
    public:
        string clearDigits(string s) {
            for (int i = 0; i < s.size(); i++) {
                if(isdigit(s.at(i))){
                    s[i] = '*';
                    int x = i - 1;
                    while (s.at(x) == '*'){
                        x--;
                    }
                    s[x] = '*';
                }
            }
            erase(s, '*');
            return s;
        }
    };
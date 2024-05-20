class Solution {
public:
    string convertToTitle(int columnNumber) {
        string returnString = "";
        while (columnNumber != 0) {
            int charNum = columnNumber % 26 + 64;
            if (charNum == 64) {
                charNum = 90;
                columnNumber -= 26;
            }
            string thisChar(1, char(charNum));
            returnString.insert(0, thisChar);
            columnNumber = columnNumber/26;
        }
        return returnString;
    }
};
class Solution {
public:
    long long largestPerimeter(vector<int>& nums) {
        sort(nums.begin(), nums.end(), greater<int>()); 
        long long total = 0;
        int size = nums.size();
        for (int i: nums){
            total += i;
        }
        for (int i: nums) {
            total -= i;
            if (total > i) {
                return total + i;
            }
            size--;
            if (size == 2){
                return -1;
            }
        }
        return 0;
    }
};
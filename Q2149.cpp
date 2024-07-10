class Solution {
public:
    vector<int> rearrangeArray(vector<int>& nums) {
        int pos = 0;
        int neg = 0;
        int val = 0;
        vector<int> returnVector(nums.size());
        while (neg < nums.size() && pos < nums.size()) {
            while (nums[pos] < 0) {
                pos++;
            }
            while (nums[neg] > 0) {
                neg++;
            }
            returnVector[val] = nums[pos];
            returnVector[val + 1] = nums[neg];
            val+=2;
            pos++;
            neg++;
        }
        return returnVector;
    }
};
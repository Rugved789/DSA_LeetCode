class Solution {
public:
    vector<int> sortedSquares(vector<int>& nums) {
        int start=0;
        int end= nums.size()-1;
        vector<int> result(nums.size());
        int index = nums.size()-1;

        while(start<=end){
            int first=nums[start]*nums[start];
            int second=nums[end]*nums[end];
            if(first>second){
                result[index]=first;
                start++;
                index--;
            }
            else{
                result[index]=second;
                end--;
                index--;
            }
        }
        return result;
    }
};
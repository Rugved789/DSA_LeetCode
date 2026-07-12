class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int unique=0;
        if(nums.size()==0){
            return 0;
        }
        for(int i=unique+1;i<nums.size();i++){
            if(nums[i]!=nums[unique]){
                nums[unique+1]=nums[i];
                unique++;
            }
        }
        return unique+1;
    }
};
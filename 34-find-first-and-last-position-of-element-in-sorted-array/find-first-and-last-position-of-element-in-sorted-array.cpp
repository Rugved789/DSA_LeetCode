class Solution {
public:
    vector<int> searchRange(vector<int>& nums, int target) {
        vector<int> result(2,-1);
        int low = 0;
        int high=nums.size()-1;
        int first=-1;
        int second=-1;

        while(low<=high){
            int mid = low + (high-low)/2;

            if(nums[mid]<target){
                low=mid+1;
                
            }
            else if(nums[mid]>target){
                high = mid-1;
            }
            else{
                first=mid;
                high=mid-1;
            }
        }
        low = 0;
        high=nums.size()-1;
        while(low<=high){
            int mid = low + (high-low)/2;

            if(nums[mid]<target){
                low=mid+1;
                
            }
            else if(nums[mid]>target){
                high = mid-1;
            }
            else{
                second=mid;
                low=mid+1;
            }
        }
        return vector<int> {first,second};
    }
};
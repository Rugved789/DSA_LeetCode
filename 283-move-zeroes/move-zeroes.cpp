class Solution {
public:
    void moveZeroes(vector<int>& nums) {
        int start=0;
        int nz=0;
        if(nums.size()==0 || nums.size()==1){
            return;
        }

        while(nz<nums.size()){
            if(nums[nz]!=0){
                int temp=nums[nz];
                nums[nz]=nums[start];
                nums[start]=temp;
                start++;
                nz++;
            }
            else{
                nz++;
            }
        }
    }
};
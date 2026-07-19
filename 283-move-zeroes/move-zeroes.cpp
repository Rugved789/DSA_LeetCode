class Solution {
public:
    void moveZeroes(vector<int>& nums) {
        int nz=0;
        int z=0;

        while(nz<nums.size()){

            if(nums.size()==1 || nums.size()==0 ) return;

            if(nums[nz]!=0){
                int temp = nums[nz];
                nums[nz]=nums[z];
                nums[z]=temp;
                nz++;
                z++;
            }
            else{
                nz++;
            }
        }
    }
};
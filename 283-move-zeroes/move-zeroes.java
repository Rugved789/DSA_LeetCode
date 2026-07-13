class Solution {
    public void moveZeroes(int[] nums) {
        int start=0;
        int nz=0;
        if(nums.length==0){
            return;
        }

        while(nz<nums.length){
            if(nums[nz]!=0){
                int temp=nums[nz];
                nums[nz]=nums[start];
                nums[start]=temp;
                nz++;
                start++;
            }
            else{
                nz++;
            }
        }
    }
}
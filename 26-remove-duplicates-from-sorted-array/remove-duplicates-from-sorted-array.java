class Solution {
    public int removeDuplicates(int[] nums) {
        int unique = 0;
        
        if(nums.length==0){
            return 0;
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[unique]){
                nums[unique+1]=nums[i];
                unique++;
            }
        }
        return unique+1;
    }
}
class Solution {
    public int removeDuplicates(int[] nums) {
        int unique = 0;
        int i=1;
        
        if(nums.length==0){
            return 0;
        }
        while( i < nums.length){
            if(nums[i]!=nums[unique]){
                nums[unique+1]=nums[i];
                unique++;
            }
            i++;
        }
        return unique+1;
    }
}
class Solution {
    public int removeDuplicates(int[] nums) {
        int unique = 0;
        int uniqueElements=1;
        int i=1;
        while( i < nums.length){
            if(nums[i]==nums[i-1]){
                i++;
            }
            else if (nums[i]!=nums[i-1]){
                nums[unique+1]=nums[i];
                uniqueElements++;
                unique++;
                i++;
            }
        }
        return uniqueElements;
    }
}
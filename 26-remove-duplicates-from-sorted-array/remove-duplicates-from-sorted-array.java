class Solution {
    public int removeDuplicates(int[] nums) {
        int unique = 0;
        int uniqueElements=1;
        int i=1;
        
        if(nums.length==0){
            return 0;
        }
        while( i < nums.length){
            if(nums[i]!=nums[unique]){
                nums[unique+1]=nums[i];
                uniqueElements++;
                unique++;
            }
            i++;
        }
        return uniqueElements;
    }
}
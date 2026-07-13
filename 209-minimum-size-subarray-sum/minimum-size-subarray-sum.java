class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int start=0;
        int end=0;
        int min=Integer.MAX_VALUE;
        int sum=0;
        
        while(end<nums.length){
            sum = sum + nums[end];
            while(sum>=target){
                int len = end-start+1;
                min = Math.min(min,len);
                sum = sum - nums[start];
                start++;
            }
            end++;
        }
        return min==Integer.MAX_VALUE ? 0 : min;
    }
}
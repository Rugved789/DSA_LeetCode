class Solution {
    public int maxSubArray(int[] nums) {
        long max = nums[0];
        long best = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            best = Math.max((long) nums[i], best + nums[i]);
            max = Math.max(max, best);
        }
        
        return (int)max;
    }
}
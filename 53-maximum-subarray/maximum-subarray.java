class Solution {
    public int maxSubArray(int[] nums) {
        int bestsum=nums[0];
        int maxsum=nums[0];

        for(int i=1;i<nums.length;i++){
            int val1 = nums[i]+bestsum;
            int val2 = nums[i];

            bestsum = Math.max(val1,val2);
            maxsum = Math.max(maxsum,bestsum);
        }
        return maxsum;
    }
}
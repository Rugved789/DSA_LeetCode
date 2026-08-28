class Solution {
    public int maxsum(int[] nums){
        int maxsum=0;
        int bestsum=0;

        for(int i=0;i<nums.length;i++){
            int val1=bestsum+nums[i];
            int val2=nums[i];
            bestsum=Math.max(val1,val2);
            maxsum=Math.max(maxsum,bestsum);
        }
        return Math.abs(maxsum);
    }
    public int minsum(int[] nums){
        int maxsum=0;
        int minsum=0;

        for(int i=0;i<nums.length;i++){
            int val1=minsum+nums[i];
            int val2=nums[i];
            minsum=Math.min(val1,val2);
            maxsum=Math.min(maxsum,minsum);
        }
        return Math.abs(maxsum);

    }
    public int maxAbsoluteSum(int[] nums) {
        int val1=maxsum(nums);
        int val2=minsum(nums);
        return Math.max(val1,val2);

    }
}
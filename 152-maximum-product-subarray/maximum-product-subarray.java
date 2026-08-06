class Solution {
    public int maxProduct(int[] nums) {
         if (nums == null || nums.length == 0) return 0;
        int maxending=nums[0];
        int minending=nums[0];
        int ans = nums[0];

        for(int i=1;i<nums.length;i++){
            int val1=nums[i];
            int val2=maxending*nums[i];
            int val3=minending*nums[i];

            maxending=Math.max(val1,Math.max(val2,val3));
            minending=Math.min(val1,Math.min(val2,val3));
            ans=Math.max(ans,Math.max(maxending,minending));
        }

        return ans;
    }
}

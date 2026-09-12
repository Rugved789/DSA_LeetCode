class Solution {
    public int missingNumber(int[] nums) {
        int size = nums.length;
        int sum = (size * (size+1)) / 2;

        for(int num : nums){
            sum=sum-num;
        }
        return sum;
    }
}